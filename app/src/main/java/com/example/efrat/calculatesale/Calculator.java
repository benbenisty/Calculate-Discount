package com.example.efrat.calculatesale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button buttonCal = (Button)findViewById(R.id.buttonCal);

        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textViewResult = (TextView)findViewById(R.id.textViewResult);
                EditText editTextBigSum = (EditText)findViewById(R.id.editTextBigSum);
                EditText editTextDiscount = (EditText)findViewById(R.id.editTextDiscount);


                double price = Integer.parseInt(editTextBigSum.getText().toString());
                double discount = Integer.parseInt(editTextDiscount.getText().toString());

                double result = (discount*price) / 100 ;
                textViewResult.setText(result + "");


            }
        });



    }
}
