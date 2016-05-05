package com.example.pankaj.chatapp.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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


public class MessageRvAdapter extends RecyclerView.Adapter<MessageRvAdapter.ViewHolder> {
    private static final String TAG = "MessageAdapter";
    private Context mContext;
    private ArrayList<Message> allMessages;

    private static final int MSG_BY_ME = 1;
    private static final int MSG_FROM_OTHER = 2;

    public MessageRvAdapter(Context mContext, ArrayList<Message> allMessages) {
        this.mContext = mContext;
        this.allMessages = allMessages;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if(viewType == MSG_BY_ME){
             v = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.single_msg_by_me, parent, false);
        }else{
            v = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.single_msg, parent, false);
        }


        Log.d(TAG, "onCreateViewHolder: "+viewType);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: "+position);
        Message msg = allMessages.get(position);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = "";
        try {
            Date date1 = format.parse(msg.getCreatedAt());
            SimpleDateFormat format1 = new SimpleDateFormat("dd MMM HH:mm");
            dateStr = format1.format(date1);
            String date = "";

            holder.date.setText(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (msg.getMedia_path() != null && !msg.getMedia_path().isEmpty()) {
            holder.msg.setVisibility(View.GONE);
            holder.imageView.setVisibility(View.VISIBLE);
            Glide.with(mContext)
                    .load(Constants.BASE_URL + msg.getMedia_path())
                    //.placeholder(R.drawable.placeholder)
                    .into(holder.imageView);
        } else {
            holder.msg.setText(msg.getMessage());
            holder.msg.setVisibility(View.VISIBLE);
            holder.imageView.setVisibility(View.GONE);

        }

        Boolean isItMe = msg.getSentById() == Utils.currentUser(mContext).getId();

        if (isItMe) {
            holder.date.setText("Me on "+dateStr);
        } else {
            holder.date.setText("Doc Name on "+dateStr);
        }
    }

    @Override
    public int getItemViewType(int position) {

        Message msg = allMessages.get(position);
        Boolean isItMe = msg.getSentById() == Utils.currentUser(mContext).getId();
        if(isItMe){
            return MSG_BY_ME;
        }
        return MSG_FROM_OTHER;

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
        RelativeLayout messageContainer;

        @Bind(R.id.messageRootContainer)
        RelativeLayout messageRootContainer;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
