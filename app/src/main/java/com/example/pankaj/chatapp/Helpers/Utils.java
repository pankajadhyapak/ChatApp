package com.example.pankaj.chatapp.Helpers;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.example.pankaj.chatapp.Auth.LoginActivity;
import com.example.pankaj.chatapp.Models.User;

import java.util.ArrayList;


/**
 * Created by pankaj on 19/01/16.
 */
public class Utils {

    public static Boolean isTokenSet(Context context){
        SharedPreferences preference = new SharedPreferenceHelper(context).getInstance();
        return preference.getBoolean(Constants.REGISTRATION_ID_SET, false);
    }

    public static Boolean isLoggedIn(Context context){
        SharedPreferences preference = new SharedPreferenceHelper(context).getInstance();
        return preference.getBoolean(Constants.LOGGED_IN, false);
    }

    public static void setLoggedInUser(Context context, User user) {
        SharedPreferences preferences = new SharedPreferenceHelper(context).getInstance();
        preferences.edit().putBoolean(Constants.LOGGED_IN, true)
                .putString(Constants.LOGGED_IN_NAME, user.getName())
                .putInt(Constants.LOGGED_IN_ID, user.getId())
                .putString(Constants.LOGGED_IN_EMAIL, user.getEmail())
                .putString(Constants.LOGGED_IN_PHONE, user.getPhone())
                .putString(Constants.LOGGED_IN_TOKEN, user.getToken())
                .apply();

    }
    public static void logout(Context context){
        SharedPreferences pref = new SharedPreferenceHelper(context).getInstance();
        pref.edit().clear().apply();
        startFreshActivity(context, LoginActivity.class);
    }



    public static User currentUser(Context context){

        if(Utils.isLoggedIn(context)){
            SharedPreferences preferences = new SharedPreferenceHelper(context).getInstance();
            User user = new User();
            user.setName(preferences.getString(Constants.LOGGED_IN_NAME, "null"));
            user.setId(preferences.getInt(Constants.LOGGED_IN_ID, 0));
            user.setEmail(preferences.getString(Constants.LOGGED_IN_EMAIL, "null"));
            user.setPhone(preferences.getString(Constants.LOGGED_IN_PHONE, "null"));
            user.setToken(preferences.getString(Constants.LOGGED_IN_TOKEN, "null"));
            return user;
        }
        return null;
    }

    public static void startFreshActivity(Context from, Class to) {
        Intent intent = new Intent(from, to);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        }
        from.startActivity(intent);
    }


    private static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    public static void showNoNetworkError(final AppCompatActivity activity) {


        final Context context =activity;

        if (!isNetworkAvailable(context)) {

            Toast.makeText(context, "No internet Connection",Toast.LENGTH_LONG).show();

//            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
//            alertDialogBuilder.setTitle("No Internet Connection");
//            alertDialogBuilder.setMessage("Need Internet Connection to pull data from Server, Offline Support Coming Soon");
//
//            alertDialogBuilder.setPositiveButton("Settings", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface arg0, int arg1) {
//                    activity.startActivity(new Intent(Settings.ACTION_SETTINGS));
//                }
//            });
//
//            alertDialogBuilder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    activity.finish();
//                }
//            });
//
//
//            AlertDialog alertDialog = alertDialogBuilder.create();
//            alertDialog.setCanceledOnTouchOutside(false);
//
//            alertDialog.show();
        }
    }

    public static void setEmptyView(RecyclerView mRecyclerView, LinearLayout emptyView, ArrayList<?> dataSet) {

        if (dataSet.isEmpty()) {
            mRecyclerView.setVisibility(View.GONE);
            emptyView.setVisibility(View.VISIBLE);
        }else{
            mRecyclerView.setVisibility(View.VISIBLE);
            emptyView.setVisibility(View.GONE);
        }
    }


    public static Drawable generateDrawable(String s, Object key) {

        ColorGenerator generator = ColorGenerator.MATERIAL;
        int color1 = generator.getColor(key);
        if(s != null && !s.isEmpty()){
            s = s.substring(0, 1);
        }else{
            s = "?";
        }
        TextDrawable drawable = TextDrawable.builder().buildRound(s.toUpperCase(), color1);

        return drawable;
    }
}
