package com.example.pankaj.chatapp.Helpers;


import com.example.pankaj.chatapp.Models.ApiError;

import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by pankaj on 20/01/16.
 */
public class ErrorUtils {

    public static ApiError parseError(Response<?> response, Retrofit retrofit) {
        Converter<ResponseBody, ApiError> converter =
                retrofit.responseBodyConverter(ApiError.class, new Annotation[0]);

        ApiError error;

        try {
            error = converter.convert(response.errorBody());
        } catch (IOException e) {
            return new ApiError();
        }

        return error;
    }
}
