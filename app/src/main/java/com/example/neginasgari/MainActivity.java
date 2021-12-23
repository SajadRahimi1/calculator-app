package com.example.neginasgari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plus;
    Button minus;
    Button divide;
    Button multiple;
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

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = String.valueOf(Integer.valueOf(number1.getText().toString()) + Integer.valueOf(number2.getText().toString()));
                answer.setText(String.valueOf(result));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = String.valueOf(Integer.valueOf(number1.getText().toString()) - Integer.valueOf(number2.getText().toString()));
                answer.setText(String.valueOf(result));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = String.valueOf(Integer.valueOf(number1.getText().toString()) / Integer.valueOf(number2.getText().toString()));
                answer.setText(String.valueOf(result));
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = String.valueOf(Integer.valueOf(number1.getText().toString()) * Integer.valueOf(number2.getText().toString()));
                answer.setText(String.valueOf(result));
            }
        });
    }
}