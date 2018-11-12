package com.example.efrat.calculatesale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculate_After_Sale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate__after__sale);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editTextPrice = (EditText)findViewById(R.id.editTextPrice);
                EditText editText2 = (EditText)findViewById(R.id.editText2);
                TextView textView = (TextView)findViewById(R.id.textView);

                double price = Integer.parseInt(editTextPrice.getText().toString());
                double discount = Integer.parseInt(editText2.getText().toString());
                double res = (price*discount)/100;
               // int div = (price*discount)/100;


                double result = price - res;
                textView.setText(result + "");
            }
        });
    }
}
