package com.example.pankaj.chatapp.Api;


import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.Models.User;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


/**
 * Created by pankaj on 19/01/16.
 */
public interface DoctorsApi {

    @GET(Constants.ALL_DOCTORS_PATH)
    Call<ArrayList<User>> getAllDoctors();

    @FormUrlEncoded
    @POST(Constants.DOCTOR_REQUEST_PATH)
    Call<User> sendFriendRequest(@Field("friend_id") Integer friend_id);


    @FormUrlEncoded
    @POST(Constants.DOCTOR_REQUEST_ACCEPT_PATH)
    Call<User> acceptFriendRequest(@Field("friend_id") Integer friend_id);

    @GET(Constants.DOCTOR_PENDING_REQUESTING)
    Call<ArrayList<User>> getFriendRequests();

    @GET(Constants.DOCTOR_FRIENDS)
    Call<ArrayList<User>> getFriends();


}
