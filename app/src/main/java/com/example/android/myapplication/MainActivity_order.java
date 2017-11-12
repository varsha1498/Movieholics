package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity_order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int Number_of_tickets=2,price_of_a_ticket=20;
    String name,eadress,movie="Golmaal Again";
    public void Increment(View view) {
        Number_of_tickets++;
        if(Number_of_tickets>15) {
            Number_of_tickets = 15;
        }
        display(Number_of_tickets);
    }
    public void Decrement(View view){
        Number_of_tickets--;
        if(Number_of_tickets<1){
            Number_of_tickets=1;
        }
        display(Number_of_tickets);

    }

    public int calculatePrice(int quantity)
    {
       int price=quantity*price_of_a_ticket;
        return price;
    }
    public void submitOrder(View view) {
      /*  display(Number_of_tickets);
        displayPrice(Number_of_tickets*price_of_a_ticket);*/

        EditText Name=(EditText) findViewById(R.id.Name_field);
        name= Name.getText().toString();

        EditText Eadress=(EditText) findViewById(R.id.email_field);
        eadress= Eadress.getText().toString();

        int price=calculatePrice(Number_of_tickets);
        String priceMessage = "\nName : "+name+ "\nMovie : "+movie+"\nAmount Due : "+ price  +"\nThankyou :)";
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, eadress);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Movie Ticket Order for "+name);
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);}
        //displayMessage(priceMessage );
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_button_1:
                if (checked)
                    movie="Golmaal Again";
                    break;
            case R.id.radio_button_2:
                if (checked)
                    movie="Secret Superstar";
                    break;
            case R.id.radio_button_3:
                if (checked)
                    movie="Jia Aur Jia";
                    break;
            case R.id.radio_button_4:
                if (checked)
                    movie="Chef";
                    break;
            case R.id.radio_button_5:
                if (checked)
                    movie="Judwaa 2";
                    break;
            case R.id.radio_button_6:
                if (checked)
                    movie="Rukh";
                    break;
        }
    }
    /**
     * This method displays the given price on the screen.
     */
   /* private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
   /* private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
     <TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Order Summary"
    android:textStyle="bold"
    android:textAllCaps="true"
    android:padding="10dp"
    android:textSize="20sp"
    android:textColor="#fc6844"
            />

    <TextView
    android:id="@+id/price_text_view"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:padding="15dp"
    android:text="Rs 0"
    android:textColor="#f24444"
    android:textSize="19sp" />*/
}