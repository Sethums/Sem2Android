package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    String default_username = "Sethu";
    String default_password = "123";
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void validateLogin(View view) {
        EditText username = (EditText) findViewById(R.id.uname);
        EditText password = (EditText) findViewById(R.id.pass);
        EditText email = (EditText) findViewById(R.id.email);
        String user_name = username.getText().toString();
        String pass = password.getText().toString();
        String emailaddress = email.getText().toString();
        String message = "Invalid login credentials";
        if (user_name.equals(default_username) && pass.equals(default_password)) {
            message = "Login success";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            sp = getSharedPreferences("UserInfo", MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("user_name", user_name);
            editor.putString("emailaddress", emailaddress);
            editor.commit();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}