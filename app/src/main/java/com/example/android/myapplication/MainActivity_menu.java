package com.example.android.myapplication;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import android.support.v7.app.AppCompatActivity;

public class MainActivity_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
            }



    public void moviesAvailable(View view)
    {
        // Start NewActivity.class
        Intent myIntent = new Intent(MainActivity_menu.this, movieAvailable.class);
        startActivity(myIntent);
    }

    public void orderNow(View view)
    {
        // Start NewActivity.class
        Intent myIntent = new Intent(MainActivity_menu.this, MainActivity_order.class);
        startActivity(myIntent);
    }
}