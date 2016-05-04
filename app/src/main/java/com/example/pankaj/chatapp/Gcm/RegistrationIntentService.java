package com.example.pankaj.chatapp.Gcm;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.widget.Toast;

import com.example.pankaj.chatapp.Api.UserApi;
import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.Helpers.RetroFit;
import com.example.pankaj.chatapp.Helpers.SharedPreferenceHelper;
import com.example.pankaj.chatapp.Helpers.Utils;
import com.example.pankaj.chatapp.Models.GCMRegistration;
import com.example.pankaj.chatapp.R;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


/**
 * Created by pankaj on 19/01/16.
 */
public class RegistrationIntentService extends IntentService{

    private static final String TAG = RegistrationIntentService.class.getSimpleName();


    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */

    public RegistrationIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        SharedPreferences preferences = new SharedPreferenceHelper(this).getInstance();
        try {

            InstanceID instanceID = InstanceID.getInstance(this);
            String token = instanceID.getToken(getString(R.string.gcm_defaultSenderId),
                    GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
            Log.i(TAG, "GCM Registration Token: " + token);

            // TODO: Implement this method to send any registration to your app's servers.
            sendRegistrationToServer(token);

            // You should store a boolean that indicates whether the generated token has been
            // sent to your server. If the boolean is false, send the token to your server,
            // otherwise your server should have already received the token.
            preferences.edit().putBoolean(Constants.REGISTRATION_ID_SET, true).apply();
            preferences.edit().putString(Constants.REGISTRATION_ID, token).apply();

            // [END register_for_gcm]
        } catch (Exception e) {
            Log.d(TAG, "Failed to complete token refresh", e);
            // If an exception happens while fetching the new token or updating our registration data
            // on a third-party server, this ensures that we'll attempt the update at a later time.
            preferences.edit().putBoolean(Constants.REGISTRATION_ID_SET, false).apply();

        }
        // Notify UI that registration has completed, so the progress indicator can be hidden.
        Intent registrationComplete = new Intent(Constants.REGISTRATION_COMPLETE);
        LocalBroadcastManager.getInstance(this).sendBroadcast(registrationComplete);

    }

    private void sendRegistrationToServer(String token) {
        
        if(Utils.isLoggedIn(this)){

            GCMRegistration gcmRegistration = new GCMRegistration();
            gcmRegistration.setRegistration_id(token);

            Retrofit retrofit = new RetroFit(this).getInstance();

            // prepare call in Retrofit 2.0
            UserApi api = retrofit.create(UserApi.class);

            Call<GCMRegistration> call = api.registerDevice(gcmRegistration);
            call.enqueue(new Callback<GCMRegistration>() {
                @Override
                public void onResponse(Call<GCMRegistration> call, Response<GCMRegistration> response) {
                    if(response.isSuccessful()){
                        Toast.makeText(RegistrationIntentService.this, "GCM Registration Success", Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(Call<GCMRegistration> call, Throwable t) {

                }
            });
        }
    }
}
