package com.example.simplecalculator;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;



import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText num1,num2;
TextView resulttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Calculate(View view) {
double number1,number2;
double sum,sub,prod,quot;
num1=(EditText) findViewById(R.id.num1);
num2=(EditText) findViewById(R.id.num2);
        number1 = Double.parseDouble(num1.getText().toString());
        number2 = Double.parseDouble(num2.getText().toString());
        resulttxt=(TextView) findViewById(R.id.result);
        if (view.getId()==R.id.add){
            sum=number1+number2;
            resulttxt.setText(Double.toString(sum));
        }
        if (view.getId()==R.id.sub){
            sub=number1-number2;
            resulttxt.setText(Double.toString(sub));
        }
        if (view.getId()==R.id.mul){
            prod=number1*number2;
            resulttxt.setText(Double.toString(prod));
        }
        if (view.getId()==R.id.div){
            quot=number1/number2;
            resulttxt.setText(Double.toString(quot));
        }
        if (view.getId()==R.id.clr){
num1.setText("");
num2.setText("");
            resulttxt.setText("");
        }
    }
}