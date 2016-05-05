package com.example.pankaj.chatapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.pankaj.chatapp.Adapter.MessageRvAdapter;
import com.example.pankaj.chatapp.Api.ChatApi;
import com.example.pankaj.chatapp.Helpers.BusProvider;
import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.Helpers.ErrorUtils;
import com.example.pankaj.chatapp.Helpers.RetroFit;
import com.example.pankaj.chatapp.Helpers.SharedPreferenceHelper;
import com.example.pankaj.chatapp.Models.ApiError;
import com.example.pankaj.chatapp.Models.Events.NewChatMsg;
import com.example.pankaj.chatapp.Models.Message;
import com.squareup.otto.Subscribe;

import java.io.File;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ChatDetail extends AppCompatActivity {

    private static final String TAG = "ChatDetail";
    public static final int REQUEST_CODE_GALLERY = 1;
    @Bind(R.id.messageEdit)
    EditText mMessageEdit;
    @Bind(R.id.chatSendButton)
    ImageButton mChatSendButton;
    @Bind(R.id.messagesContainer)
    RecyclerView mMessagesContainer;
   // private MessageRvAdapter mAdapter;
    private MessageRvAdapter mAdapter;
    private ArrayList<Message> allMessages =  new ArrayList<>();
    SharedPreferences preferences;
    String imgDecodableString;
    private int chatToId = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chat_detail);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        preferences = new SharedPreferenceHelper(this).getInstance();
        BusProvider.getInstance().register(this);
        chatToId = getIntent().getIntExtra("chatToId", 0);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        mMessagesContainer.setLayoutManager(layoutManager);

        mAdapter =  new MessageRvAdapter(this, allMessages);
        mMessagesContainer.setAdapter(mAdapter);

    }

    @Subscribe
    public void newChatMsg(NewChatMsg event) {
        Log.e(TAG, "newChatMsg: " + event.toString());

        if (event.getMedia_path() == null || event.getMedia_path().isEmpty()) {

            Log.e(TAG, "newChatMsg: inside if");
            Message m = new Message();
            m.setId(Integer.parseInt(event.getId()));
            m.setCreatedAt(event.getCreated_at());
            m.setMessage(event.getMessage());
            m.setRead(0);
            m.setSentById(Integer.parseInt(event.getSent_by()));
            m.setSentToId(Integer.parseInt(event.getSent_to()));
            m.setUpdatedAt(event.getUpdated_at());

            allMessages.add(m);
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    mAdapter.notifyDataSetChanged();
                }
            });
        } else {
            Log.e(TAG, "newChatMsg: inside else");

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    getData();
                }
            });
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        preferences.edit().putInt(Constants.CURRENT_CHATTING_ID, chatToId).apply();
        getData();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        preferences.edit().remove(Constants.CURRENT_CHATTING_ID).apply();
    }

    @Override
    protected void onStop() {
        super.onStop();
        preferences.edit().remove(Constants.CURRENT_CHATTING_ID).apply();
    }

    public void getData() {
        final Retrofit retrofit = new RetroFit(this).getInstance();

        // prepare call in Retrofit 2.0
        ChatApi api = retrofit.create(ChatApi.class);

        Call<ArrayList<Message>> call = api.getAllMessages(chatToId);

        call.enqueue(new Callback<ArrayList<Message>>() {
            @Override
            public void onResponse(Call<ArrayList<Message>> call, Response<ArrayList<Message>> response) {
                if (response.isSuccessful()) {
                    allMessages.clear();
                    allMessages.addAll(response.body());
                    mAdapter.notifyDataSetChanged();
//                    scrollMyListViewToBottom();

                    Toast.makeText(ChatDetail.this, "" + allMessages.size(), Toast.LENGTH_SHORT).show();

                } else {
                    ApiError error = ErrorUtils.parseError(response, retrofit);
                    Toast.makeText(ChatDetail.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Message>> call, Throwable t) {
                Toast.makeText(ChatDetail.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.chatSendButton)
    public void sendMessage(View v) {

        String msg = mMessageEdit.getText().toString().trim();

        if (msg == null || msg.isEmpty()) {
            Toast.makeText(ChatDetail.this, "Enter Message", Toast.LENGTH_SHORT).show();
        } else {
            sendChatMsg(msg);
        }

    }

    private void sendChatMsg(String msg) {
        final Retrofit retrofit = new RetroFit(this).getInstance();

        // prepare call in Retrofit 2.0
        ChatApi api = retrofit.create(ChatApi.class);

        Call<Message> call = api.sendMessage(chatToId, msg);
        call.enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                if (response.isSuccessful()) {
                    mMessageEdit.setText("");
                    getData();
                } else {
                    ApiError error = ErrorUtils.parseError(response, retrofit);
                    Toast.makeText(ChatDetail.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                Log.e("ssmksmd", "onFailure: " + t.getMessage());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chat_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_attachment) {
            openGallery();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void openGallery() {
        Intent galleryintent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(galleryintent, REQUEST_CODE_GALLERY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK
                && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            // Move to first row
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            imgDecodableString = cursor.getString(columnIndex);
            cursor.close();
            // String encodedImage = encodeImage(imgDecodableString);

            final Retrofit retrofit = new RetroFit(this).getInstance();

            File imagefile = new File(imgDecodableString);
            RequestBody requestFile =
                    RequestBody.create(MediaType.parse("multipart/form-data"), imagefile);
            MultipartBody.Part body =
                    MultipartBody.Part.createFormData("picture", imagefile.getName(), requestFile);
            String descriptionString = Integer.toString(chatToId);
            RequestBody description =
                    RequestBody.create(
                            MediaType.parse("multipart/form-data"), descriptionString);
            // prepare call in Retrofit 2.0
            ChatApi api = retrofit.create(ChatApi.class);

            Call<ResponseBody> call = api.sendMessageWithMedia(description, body);

            call.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    if (response.isSuccessful()) {
                        Log.d(TAG, "FileonResponse: " + response.body());
                        getData();
                    } else {

                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    Log.e(TAG, "FileonFailure: " + t.getMessage());
                }
            });

            //sendChatMsg(encodedImage, true);

        }
    }
}
