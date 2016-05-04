package com.example.pankaj.chatapp.Api;


import com.example.pankaj.chatapp.Helpers.Constants;
import com.example.pankaj.chatapp.Models.Case.AllDetails;
import com.example.pankaj.chatapp.Models.Case.ApiSuccess;

import java.util.ArrayList;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by pankaj on 18/04/16.
 */
public interface CaseApi {

    @POST(Constants.CASE_STORE_PATH)
    Call<ArrayList<AllDetails>> storeCase(@QueryMap Map<String, String> options);

    @GET(Constants.CASE_GET_ALL_PATH)
    Call<ArrayList<AllDetails>> getCases();

    @GET(Constants.CASE_GET_SHARED_PATH)
    Call<ArrayList<AllDetails>> getSharedCases();

    @FormUrlEncoded
    @POST(Constants.CASE_SHARE_PATH)
    Call<ApiSuccess> shareCase(@Field("case_id") String case_id, @Field("user_ids") String user_ids);
}
