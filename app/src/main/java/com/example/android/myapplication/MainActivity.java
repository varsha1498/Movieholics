package com.example.android.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button b = (Button) findViewById(R.id.button1);
        //b.setOnClickListener(new View.OnClickListener(){
          /*  @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,MainActivity_order.class);
                startActivity(intent);
            }
        });*/
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.title_text_view);
        quantityTextView.setText("" + number);
    }

    public void OnGetStarted(View view)
    {
        Intent intent=new Intent(MainActivity.this,MainActivity_menu.class);
        startActivity(intent);
    }

}
