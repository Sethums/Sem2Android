package com.example.framelayout;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.framelayout.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Swapimage(View view) {
        i1=(ImageView) findViewById(R.id.img1);
        i2=(ImageView) findViewById(R.id.img2);
        i3=(ImageView) findViewById(R.id.img3);
        i4=(ImageView) findViewById(R.id.img4);
        if(view.getId()==R.id.img1){
            i1.setVisibility(view.GONE);
            i2.setVisibility(view.VISIBLE);
            i3.setVisibility(view.VISIBLE);
            i4.setVisibility(view.VISIBLE);
        }

        else{
            i1.setVisibility(view.VISIBLE);
            i2.setVisibility(view.GONE);
            i3.setVisibility(view.GONE);
            i4.setVisibility(view.GONE);
        }
    }
}