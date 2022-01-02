package com.example.mohadeseashori;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton plus;
    ImageButton minus;
    ImageButton divide;
    ImageButton multiple;
    ImageButton multiple2;
    EditText number1;
    EditText number2;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        multiple = findViewById(R.id.multiple);
        number1 = findViewById(R.id.firstNumber);
        number2 = findViewById(R.id.secondNumber);
        answer = findViewById(R.id.answer);

    }

    public void onClick(View v) {
        String result = "0";
        switch (v.getId()) {
            case R.id.plus:
                result = String.valueOf(Float.parseFloat(number1.getText().toString()) + Float.parseFloat(number2.getText().toString()));
                break;
            case R.id.minus:
                result = String.valueOf(Float.parseFloat(number1.getText().toString()) - Float.parseFloat(number2.getText().toString()));
                break;
            case R.id.divide:
                result = String.valueOf(Float.parseFloat(number1.getText().toString()) / Float.parseFloat(number2.getText().toString()));
                break;
            case R.id.multiple:
                result = String.valueOf(Float.parseFloat(number1.getText().toString()) * Float.parseFloat(number2.getText().toString()));
                break;
        }
        answer.setText(String.valueOf(result));
    }
}