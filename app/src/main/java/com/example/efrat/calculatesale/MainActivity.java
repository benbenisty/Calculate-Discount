package com.example.efrat.calculatesale;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button ButtonPrecent = (Button)findViewById(R.id.ButtonPrecent);
            Button buttonCost = (Button)findViewById(R.id.buttonCost);

            ButtonPrecent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent discountIntent = new Intent(getApplicationContext(),Calculator.class);
                    startActivity(discountIntent);
                }
            });

            buttonCost.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent after_discoutIntent = new Intent(getApplicationContext(),Calculate_After_Sale.class);
                    startActivity(after_discoutIntent);
                }
            });


    }




        }
