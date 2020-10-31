package com.edmondkachale.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText firstNumberEditText;
    EditText secondNumberEditText;
    EditText resultEditText;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        resultEditText = findViewById(R.id.resultEditText);
        addButton = findViewById(R.id.addButton);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber, secondNumber, result;
                firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

                result = firstNumber + secondNumber;

                resultEditText.setText(String.valueOf(result));

            }
        });
    }
}
