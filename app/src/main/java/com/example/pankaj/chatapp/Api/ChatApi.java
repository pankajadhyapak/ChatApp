package com.example.pankaj.chatapp.Api;


import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.Models.Chat;
import com.example.pankaj.chatapp.Models.Message;

import java.util.ArrayList;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by pankaj on 26/04/16.
 */
public interface ChatApi {

    @GET(Constants.ALL_CHATS_PATH)
    Call<ArrayList<Chat>> getAllChats(@Path("id") Integer case_id);

    @GET(Constants.ALL_MESSAGES_PATH)
    Call<ArrayList<Message>> getAllMessages(@Query("otherId") Integer chat_id);

    @FormUrlEncoded
    @POST(Constants.SEND_MESSAGE_PATH)
    Call<Message> sendMessage(@Field("otherId") Integer sent_to_id, @Field("message") String message);


    @Multipart
    @POST(Constants.SEND_IMAGE_PATH)
    Call<ResponseBody> sendMessageWithMedia(@Part("otherId") RequestBody otherId,
                                            @Part MultipartBody.Part file);
}
