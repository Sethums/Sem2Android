package com.example.activitylifecycle;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.activitylifecycle.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    String default_user = "sethu";
    String default_pass = "123";
    SharedPreferences sp=getSharedPreferences("MainActivity2",MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onSart fun", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop fun", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart fun", Toast.LENGTH_SHORT).show();
    }

    public void validate(View view) {
        EditText username = (EditText) findViewById(R.id.uname);
        EditText password = (EditText) findViewById(R.id.pass);
        String user_name = username.getText().toString();
        String pass = password.getText().toString();
        String message = "Invalid login credentials";
        if (user_name.equals(default_user) && pass.equals(default_pass))
            message = "Login success";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();


    }
}