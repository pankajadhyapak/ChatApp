package com.example.pankaj.chatapp.Adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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


public class MessageAdapter extends BaseAdapter {

    private static final String TAG = "MessageAdapter";
    private Context mContext;
    private ArrayList<Message> allMessages;

    public MessageAdapter(ArrayList<Message> allMessages, Context context) {
        this.allMessages = allMessages;
        this.mContext = context;
    }


    @Override
    public int getCount() {
        return allMessages.size();
    }

    @Override
    public Object getItem(int position) {
        return allMessages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Log.d(TAG, "getView: "+ getItemViewType(position));
        final ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.single_msg, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

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
            Log.e(TAG, "getView: in if" + msg.getMedia_path());
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
            Log.e(TAG, "getView: in else");

        }

        Boolean isItMe = msg.getSentById() == Utils.currentUser(mContext).getId();

        if (isItMe) {
            holder.date.setText("Me on "+dateStr);
            holder.messageRootContainer.setGravity(Gravity.RIGHT);
            holder.messageContainer.setBackgroundResource(R.drawable.msg_bubble_incoming_a);
            if (msg.getMedia_path() != null && !msg.getMedia_path().isEmpty()) {
                holder.imageView.setPadding(0, 0, 30, 0);
            } else {
                holder.msg.setPadding(0, 0, 30, 0);
                holder.msg.setTextColor(ContextCompat.getColor(mContext, R.color.white));
            }
        } else {
            holder.date.setText("Doc Name on "+dateStr);
            holder.messageRootContainer.setGravity(Gravity.LEFT);
            holder.messageContainer.setBackgroundResource(R.drawable.msg_bubble_input);
            if (msg.getMedia_path() != null && !msg.getMedia_path().isEmpty()) {
                holder.imageView.setPadding(0, 0, 0, 0);
            } else {
                holder.msg.setPadding(0, 0, 30, 0);
                holder.msg.setTextColor(ContextCompat.getColor(mContext, R.color.black));
            }
        }

        return convertView;
    }

    static class ViewHolder {

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
            ButterKnife.bind(this, view);
        }
    }
}
