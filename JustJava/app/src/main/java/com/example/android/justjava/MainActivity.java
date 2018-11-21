package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    int cost = 11;
    int quantity = 0;
    int pCup = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    /**
     * This method is called when the order button is clicked.
     */
   /* public void submitOrder(View view) {

        display(quantity);
        displayPrice((quantity*cost)+ (quantity*pCup));
    }*/

    public void incQuantityUp(View view){
        quantity++;
        display(quantity);
    }


    public void decQuantity(View view){
        quantity--;
        if (quantity < 0){
            quantity = 0;
            Toast.makeText(this, "Quantity of cups of coffee can not be less than zero!", Toast.LENGTH_SHORT).show();
        }

        display(quantity);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.cost_text_view);
        priceTextView.setText(message);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.cost_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void submitOrder(View view){
        String priceMessage = "Item count " + quantity + "\n" + "Total Price: R" +( quantity*cost);
        displayMessage(priceMessage);
    }



}
