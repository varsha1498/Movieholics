package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class movieAvailable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_available);
    }
    /*public void moviesAvailable(View view)
    {
        // Start NewActivity.class
        Intent myIntent = new Intent(MainActivity_menu.this, movieAvailable.class);
        startActivity(myIntent);
    }*/

}
