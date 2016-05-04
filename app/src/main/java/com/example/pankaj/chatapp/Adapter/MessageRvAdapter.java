package com.example.pankaj.chatapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.Helpers.Utils;
import com.example.pankaj.chatapp.Models.Message;
import com.example.pankaj.chatapp.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by pankaj on 02/05/16.
 */
public class MessageRvAdapter extends RecyclerView.Adapter<MessageRvAdapter.ViewHolder> {
    private static final String TAG = "MessageAdapter";
    private Context mContext;
    private ArrayList<Message> allMessages;


    public MessageRvAdapter(Context mContext, ArrayList<Message> allMessages) {
        this.mContext = mContext;
        this.allMessages = allMessages;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.single_msg, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Message msg = allMessages.get(position);


        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date1 = format.parse(msg.getCreatedAt());
            SimpleDateFormat format1 = new SimpleDateFormat("dd MMM HH:mm");
            String dateStr = format1.format(date1);
            String date = "";

            holder.date.setText(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        if(msg.getMedia_path() != null && !msg.getMedia_path().isEmpty()){
            holder.msg.setVisibility(View.GONE);
            holder.imageView.setVisibility(View.VISIBLE);
            Glide.with(mContext)
                    .load(Constants.BASE_URL+msg.getMedia_path())
                    .placeholder(R.drawable.placeholder)
                    .into(holder.imageView);
        }else{
            holder.msg.setText(msg.getMessage());
            holder.msg.setVisibility(View.VISIBLE);
            holder.imageView.setVisibility(View.GONE);

        }

        Boolean isItMe = msg.getSentById() == Utils.currentUser(mContext).getId();

        if(isItMe){
            holder.messageRootContainer.setGravity(Gravity.RIGHT);
            holder.messageContainer.setBackgroundColor(mContext.getResources().getColor(R.color.color_chat_me));
        }else {
            holder.messageRootContainer.setGravity(Gravity.LEFT);
            holder.messageContainer.setBackgroundColor(mContext.getResources().getColor(R.color.color_chat_other));

        }

    }

    @Override
    public int getItemCount() {
        return allMessages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.msg)
        TextView msg;

        @Bind(R.id.date)
        TextView date;

        @Bind(R.id.msgImage)
        ImageView imageView;

        @Bind(R.id.messageContainer)
        LinearLayout messageContainer;

        @Bind(R.id.messageRootContainer)
        LinearLayout messageRootContainer;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
