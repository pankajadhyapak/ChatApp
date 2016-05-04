package com.example.pankaj.chatapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.pankaj.chatapp.Adapter.AllUserAdapter;
import com.example.pankaj.chatapp.Api.UserApi;
import com.example.pankaj.chatapp.Auth.LoginActivity;
import com.example.pankaj.chatapp.Gcm.RegistrationIntentService;
import com.example.pankaj.chatapp.Helpers.BusProvider;
import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.Helpers.RetroFit;
import com.example.pankaj.chatapp.Helpers.SharedPreferenceHelper;
import com.example.pankaj.chatapp.Helpers.Utils;
import com.example.pankaj.chatapp.Models.User;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private static final String TAG = "MainActivity";
    @Bind(R.id.allUsersList)
    ListView mAllUsersList;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    private BroadcastReceiver mRegistrationBroadcastReceiver;
    SharedPreferences preferences;
    private ArrayList<User> allUsers =  new ArrayList<>();
    private AllUserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        preferences = new SharedPreferenceHelper(this).getInstance();
        BusProvider.getInstance().register(this);


        if (!Utils.isLoggedIn(this)) {
            finish();
            Utils.startFreshActivity(this, LoginActivity.class);
        }

        if (!Utils.isTokenSet(this) && Utils.isLoggedIn(this)) {

            if (checkPlayServices()) {
                // Start IntentService to register this application with GCM.
                Intent intent = new Intent(this, RegistrationIntentService.class);
                startService(intent);
            }
        }

        mRegistrationBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                SharedPreferences sharedPreferences =
                        PreferenceManager.getDefaultSharedPreferences(context);
                boolean sentToken = sharedPreferences.getBoolean(Constants.REGISTRATION_ID_SET, false);
                String token = sharedPreferences.getString(Constants.REGISTRATION_ID, null);
            }
        };





        mAllUsersList.setOnItemClickListener(this);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mSwipeRefreshLayout.setRefreshing(true);
                getData();

            }
        });

        adapter = new AllUserAdapter(allUsers, this);
        mAllUsersList.setAdapter(adapter);
        getData();
    }

    private void getData() {
        final Retrofit retrofit = new RetroFit(this).getInstance();

        // prepare call in Retrofit 2.0
        UserApi api = retrofit.create(UserApi.class);

        Call<ArrayList<User>> call = api.getAllUsers();

        call.enqueue(new Callback<ArrayList<User>>() {
            @Override
            public void onResponse(Call<ArrayList<User>> call, Response<ArrayList<User>> response) {
                if (response.isSuccessful()) {
                    allUsers.clear();
                    allUsers.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    if(mSwipeRefreshLayout != null && mSwipeRefreshLayout.isRefreshing()){
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                }
            }

            @Override
            public void onFailure(Call<ArrayList<User>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(mRegistrationBroadcastReceiver, new IntentFilter(Constants.REGISTRATION_COMPLETE));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_logout) {
            Utils.logout(this);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean checkPlayServices() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (apiAvailability.isUserResolvableError(resultCode)) {
                apiAvailability.getErrorDialog(this, resultCode, 9000)
                        .show();
            } else {
                Log.i("checkPlayServices", "This device is not supported.");
                finish();
            }
            return false;
        }
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, ChatDetail.class).putExtra("chatToId", allUsers.get(position).getId()));
    }
}
