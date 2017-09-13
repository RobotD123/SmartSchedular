package com.example.vivek.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etUsername,etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText)findViewById(R.id.et_username);
        etPassword = (EditText)findViewById(R.id.et_password);
        btnLogin = (Button)findViewById(R.id.btn_login);

    }

    @Override
    protected void onStart() {
        super.onStart();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (!username.equals("vivek")){
                    etUsername.setError("Enter correct username");
                }else if(!password.equals("12345")){
                    etPassword.setError("Enter correct password");
                }else{

                    Intent intent = new Intent(MainActivity.this,DrawerActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
