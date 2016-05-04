package com.example.pankaj.chatapp.Helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by pankaj on 19/01/16.
 */
public class SharedPreferenceHelper {
    public SharedPreferences preference = null;
    public Context context = null;

    public SharedPreferenceHelper(Context context) {
        this.context = context;
    }

    public SharedPreferences getInstance(){
        if(preference == null){
            this.preference = PreferenceManager.getDefaultSharedPreferences(this.context);
        }

        return preference;
    }

}
