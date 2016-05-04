package com.example.pankaj.chatapp.Auth;

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

public class RegistrationActivity extends AppCompatActivity {


    private static final String TAG = RegistrationActivity.class.getSimpleName();
    @Bind(R.id.name)
    EditText name;
    @Bind(R.id.email)
    EditText email;
    @Bind(R.id.phone)
    EditText phone;
    @Bind(R.id.password)
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.LoginText)
    public void loginTextAction(View v) {
        Utils.startFreshActivity(this, LoginActivity.class);
    }

    @OnClick(R.id.signupBtn)
    public void doRegister(View v) {

        String nameStr = name.getText().toString();
        String emailStr = email.getText().toString();
        String passwordStr = password.getText().toString();
        String phoneStr = phone.getText().toString();

        if (nameStr.isEmpty() || emailStr.isEmpty() || passwordStr.isEmpty() || phoneStr.isEmpty()) {
            Snackbar.make(v, "Please Enter All Fields ", Snackbar.LENGTH_LONG).show();
        } else {
            User user = new User();
            user.setEmail(emailStr);
            user.setName(nameStr);
            user.setPassword(passwordStr);
            user.setPhone(phoneStr);

            final Retrofit retrofit = new RetroFit(this).getInstance();

            // prepare call in Retrofit 2.0
            UserApi api = retrofit.create(UserApi.class);

            Call<User> call = api.createUser(user);
            call.enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    if(response.isSuccessful()){
                        Log.e(TAG, response.body().toString());
                        Utils.setLoggedInUser(RegistrationActivity.this, response.body());
                        Utils.startFreshActivity(RegistrationActivity.this, MainActivity.class);
                    }else {
                        // parse the response body …
                        ApiError error = ErrorUtils.parseError(response, retrofit);
                        Toast.makeText(RegistrationActivity.this,error.getMessage(),Toast.LENGTH_SHORT).show();
                        Log.d("error message", error.getMessage());
                    }
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {

                }
            });

        }


    }
}

