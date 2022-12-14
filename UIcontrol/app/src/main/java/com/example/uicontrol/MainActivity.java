package com.example.uicontrol;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.uicontrol.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
LinearLayout l1;
TextView t;
Button b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        l1 = new LinearLayout(this);
        t = new TextView(this);
        b = new Button(this);
        LinearLayout.LayoutParams dim = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        l1.setLayoutParams(dim);
        LinearLayout.LayoutParams vdim = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        vdim.setMargins(0,50,0,0);
        t.setLayoutParams(vdim);
        b.setLayoutParams(vdim);
        l1.setOrientation(LinearLayout.VERTICAL);
        l1.setGravity(Gravity.CENTER);
        t.setText("UI Control");
        t.setTextColor(Color.BLACK);
        t.setTextSize(35);
        t.setGravity(Gravity.CENTER);
        b.setText("Submit");
        b.setBackgroundColor(Color.GRAY);
        l1.addView(t);
        l1.addView(b);
        setContentView(l1);


    }
    }


