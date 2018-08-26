package com.rohit.lpregister.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rohit.lpregister.R;
import com.rohit.lpregister.database.DatabaseHelper;
import com.rohit.lpregister.utils.InputValidation;

public class LoginActivity extends AppCompatActivity  implements View.OnClickListener {

    private EditText mEditTextEmail, mEditTextPassword;

    private Button mButtonLogin;

    private TextView mTextViewRegister, mTextViewAdminLogin, mTextViewForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView(); // initView() method call

        clickListener(); // clickListener(); method call

        initObject(); // initObject method call
    }


    /**
     * clickListener() method definition
     */

    private void clickListener() {

        mButtonLogin.setOnClickListener(this);

        mTextViewAdminLogin.setOnClickListener(this);
        mTextViewRegister.setOnClickListener(this);
        mTextViewForgotPassword.setOnClickListener(this);

    }

    /**
     * intiView Method definition
     */
    private void initView() {

      mEditTextEmail = findViewById(R.id.editText_login_email);
      mEditTextPassword = findViewById(R.id.editText_login_password);

      mButtonLogin = findViewById(R.id.button_login);

      mTextViewAdminLogin = findViewById(R.id.textView_admin);
      mTextViewRegister = findViewById(R.id.textView_register);
      mTextViewForgotPassword = findViewById(R.id.textView_forgot_password);


    }

    public void initObject(){


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button_login:

                break;

            case R.id.textView_admin:
                break;

            case R.id.textView_register:
                break;

            case R.id.textView_forgot_password:
                break;
        }

    }
}
