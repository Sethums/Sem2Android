package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.save).setOnClickListener(view -> {
            Toast toast = new Toast(this);
            toast.setView(LayoutInflater.from(this).inflate(R.layout.activity_toast,null));
            toast.show();
        });
    }
}