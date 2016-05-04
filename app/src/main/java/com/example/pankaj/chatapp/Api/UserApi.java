package com.example.pankaj.chatapp.Api;

import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.Models.GCMRegistration;
import com.example.pankaj.chatapp.Models.User;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


/**
 * Created by pankaj on 19/01/16.
 */
public interface UserApi {

    @POST(Constants.REGISTRATION_PATH)
    Call<User> createUser(@Body User user);

    @POST(Constants.LOGIN_PATH)
    Call<User> loginUser(@Body User user);


    @POST(Constants.GCM_REGISTER_PATH)
    Call<GCMRegistration> registerDevice(@Body GCMRegistration gcmRegistration);

    @GET(Constants.ALL_USERS_PATH)
    Call<ArrayList<User>> getAllUsers();
}
