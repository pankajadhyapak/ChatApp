package com.example.pankaj.chatapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pankaj.chatapp.Helpers.Utils;
import com.example.pankaj.chatapp.Models.User;
import com.example.pankaj.chatapp.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by pankaj on 30/04/16.
 */
public class AllUserAdapter extends BaseAdapter {

    private List<User> allUsers;
    private Context mContext;

    public AllUserAdapter(Context mContext) {
        this.allUsers = allUsers;
        this.mContext = mContext;
    }

    public void setData(List<User> details) {
        this.allUsers = details;
    }

    @Override
    public int getCount() {
        return allUsers.size();
    }

    @Override
    public Object getItem(int position) {
        return allUsers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return allUsers.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.single_doctor, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final User user = allUsers.get(position);
        holder.mDocName.setText(user.getName());
        holder.mDocDescription.setText("Bangalore");
        holder.mDocImage.setImageDrawable(Utils.generateDrawable(user.getName(), user.getId()));

        return convertView;

    }

    static class ViewHolder {
        @Bind(R.id.docImage)
        ImageView mDocImage;
        @Bind(R.id.docName)
        TextView mDocName;
        @Bind(R.id.docDescription)
        TextView mDocDescription;
        @Bind(R.id.onlieStatusBtn)
        TextView mOnlieStatusBtn;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
