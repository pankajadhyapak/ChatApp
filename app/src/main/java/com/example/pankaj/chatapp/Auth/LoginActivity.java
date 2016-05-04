package com.example.pankaj.chatapp.Auth;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pankaj.chatapp.Api.UserApi;
import com.example.pankaj.chatapp.Helpers.ErrorUtils;
import com.example.pankaj.chatapp.Helpers.RetroFit;
import com.example.pankaj.chatapp.Helpers.Utils;
import com.example.pankaj.chatapp.MainActivity;
import com.example.pankaj.chatapp.Models.ApiError;
import com.example.pankaj.chatapp.Models.User;
import com.example.pankaj.chatapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getSimpleName();

    @Bind(R.id.loginEmail)
    EditText loginEmail;
    @Bind(R.id.loginPassword)
    EditText loginPassword;

    Dialog mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogin);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @OnClick(R.id.signUpText)
    public void navigateToSignup(View v){
        Utils.startFreshActivity(this, RegistrationActivity.class);
    }

    @OnClick(R.id.loginBtn)
    public void doLogin(View view){

        String emailStr = loginEmail.getText().toString();
        String passwordStr = loginPassword.getText().toString();

        if(emailStr.isEmpty() || passwordStr.isEmpty()){
            Snackbar.make(view, "Please Enter All Fields ", Snackbar.LENGTH_LONG).show();
        }else {
            User user = new User();
            user.setEmail(emailStr);
            user.setPassword(passwordStr);

            final Retrofit retrofit = new RetroFit(this).getInstance();

            // prepare call in Retrofit 2.0
            UserApi api = retrofit.create(UserApi.class);

            Call<User> call = api.loginUser(user);
            mProgressBar = ProgressDialog.show(LoginActivity.this, "", "Logging In", true);
            call.enqueue(new Callback<User>() {

                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    mProgressBar.dismiss();

                    if(response.isSuccessful()) {
                        Log.e(TAG, response.body().toString());
                        Utils.setLoggedInUser(LoginActivity.this, response.body());
                        Utils.startFreshActivity(LoginActivity.this, MainActivity.class);
                    }else{

                        // parse the response body …
                        ApiError error = ErrorUtils.parseError(response, retrofit);
                        Toast.makeText(LoginActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                        Log.d("error message", error.getMessage());
                    }
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {
                    mProgressBar.dismiss();
                }
            });

        }

    }
}

