package com.example.pankaj.chatapp.Helpers;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by pankaj on 19/01/16.
 */
public class RetroFit {

    private static final String TAG = "RetroFit";
    private Context context;
    private Retrofit retrofit = null;

    public RetroFit(Context context) {
        this.context = context;
    }

    public Retrofit getInstance() {

        try{
            Utils.showNoNetworkError((AppCompatActivity)context);
        }catch (ClassCastException e){
            Log.e(TAG, "getInstance: "+e.getMessage());

        }

        // For logging Requests and Response ( only for Development )
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.addInterceptor(logging);

        if(Utils.isLoggedIn(context)) {
            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();

                    Request request = original.newBuilder()
                            .header("Authorization", "Bearer " + Utils.currentUser(context).getToken())
                            .method(original.method(), original.body())
                            .build();
                    return chain.proceed(request);
                }
            });
        }

        this.retrofit = new Retrofit.Builder()
                .baseUrl(Constants.API_BASE_URL)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        
        return this.retrofit;
    }

}
