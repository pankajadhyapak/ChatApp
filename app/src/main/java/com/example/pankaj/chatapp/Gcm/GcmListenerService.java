package com.example.pankaj.chatapp.Gcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.example.pankaj.chatapp.Helpers.BusProvider;
import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.MainActivity;
import com.example.pankaj.chatapp.Models.Events.NewChatMsg;
import com.example.pankaj.chatapp.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Random;

/**
 * Created by pankaj on 19/01/16.
 */
public class GcmListenerService extends com.google.android.gms.gcm.GcmListenerService {
    private static final String TAG = "MyGcmListenerService";

    /**
     * Called when message is received.
     *
     * @param from SenderID of the sender.
     * @param data Data bundle containing message data as key/value pairs.
     *             For Set of keys use data.keySet().
     */
    // [START receive_message]
    @Override
    public void onMessageReceived(String from, Bundle data) {
        String message = data.getString("message");
        String type= data.getString("type");

        Log.d(TAG, "From: " + from);
        Log.d(TAG, "Message: " + message);
        Log.d(TAG, "type: " + type);



        BusProvider.getInstance().register(this);

        if(type.equalsIgnoreCase("newChatMessage")){
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);

            if(preferences.getInt(Constants.CURRENT_CHATTING_ID,0) == 0){
                sendNotification("SocioDoc",message, MainActivity.class,type);
            }else {
                String m = data.getString("chatMsg");
                try {
                    JSONObject newMsg = new JSONObject(m);
                    String id = newMsg.getString("id");
                    String sent_by = newMsg.getString("sent_by");
                    String sent_to = newMsg.getString("sent_to");
                    String msg = null;
                    if(newMsg.has("message")){
                        msg = newMsg.getString("message");
                    }
                    String media_path = null;
                    if(newMsg.has("media_path")){
                        media_path = newMsg.getString("media_path");
                    }
                    String updated_at = newMsg.getString("updated_at");
                    String created_at = newMsg.getString("created_at");
                    BusProvider.getInstance().post(new NewChatMsg(id, sent_by,sent_to,msg,media_path, updated_at,created_at));

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Log.e(TAG, "onMessageReceived: "+m);

            }

        }

        else if(type.equalsIgnoreCase("newFriendRequest")){
            sendNotification("SocioDoc - New Doctor Request ",message, MainActivity.class, type);

        }else {
            sendNotification("SocioDoc",message, MainActivity.class,type);
        }

        // [START_EXCLUDE]
        /**
         * Production applications would usually process the message here.
         * Eg: - Syncing with server.
         *     - Store message in local database.
         *     - Update UI.
         */

        /**
         * In some cases it may be useful to show a notification indicating to the user
         * that a message was received.
         */
        // [END_EXCLUDE]
    }
    // [END receive_message]

    /**
     * Create and show a simple notification containing the received GCM message.
     *
     * @param message GCM message received.
     */
    private void sendNotification(String title, String message, Class resultActivity, String type) {


        Intent intent = new Intent(this, resultActivity);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("notificationType", type);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 , intent, PendingIntent.FLAG_ONE_SHOT);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_action_bell)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Random rand = new Random();

        notificationManager.notify(rand.nextInt(), notificationBuilder.build());
    }
}
