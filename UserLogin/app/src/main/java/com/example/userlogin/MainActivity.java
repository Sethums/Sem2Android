package com.example.userlogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    String default_username = "Sethu";
    String default_password = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart func", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop func", Toast.LENGTH_SHORT).show();
    }

    public void validateLogin(View view) {
        EditText username = (EditText) findViewById(R.id.uname);
        EditText password = (EditText) findViewById(R.id.pass);
        String user_name = username.getText().toString();
        String pass = password.getText().toString();
        String message = "Invalid login credentials";
        if (user_name.equals(default_username) && pass.equals(default_password))
            message = "Login success";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
   Intent intent=new Intent(MainActivity.this,MainActivity2.class);
   startActivity(intent);
    }

}