package com.example.adapterdemo;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.adapterdemo.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


        //initialize view's
        ListView simpleListView;
        String[] fruitsNames = {"Sunflower", "Rose","Lotus"};//fruit names array
        int[] fruitsImages = {R.drawable.sun, R.drawable.rose,R.drawable.lotus};//fruits images
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            simpleListView=(ListView) findViewById(R.id.simpleListView);

            ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
            for (int i=0;i<fruitsNames.length;i++)
            {
                HashMap<String,String> hashMap=new HashMap<>();//create a hashmap to store the data in key value pair
                hashMap.put("name",fruitsNames[i]);
                hashMap.put("image",fruitsImages[i]+"");
                arrayList.add(hashMap);//add the hashmap into arrayList
            }
            String[] from={"name","image"};//string array
            int[] to={R.id.textview_first,R.id.imageView};//int array of views id's
            SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.list_view_items,from,to);//Create object and set the parameters for simpleAdapter
            simpleListView.setAdapter(simpleAdapter);//sets the adapter for listView

            //perform listView item click event
            simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(getApplicationContext(),fruitsNames[i],Toast.LENGTH_LONG).show();//show the selected image in toast according to position
                }
            });
        }


    }
