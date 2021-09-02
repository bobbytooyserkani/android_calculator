package com.example.hw2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numberOneEditText, numberTwoEditText;
    TextView resultTextView;
    Button addButton,subButton,multiplyButton,divideButton,clearButton;

    double result = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOneEditText=(EditText)findViewById(R.id.editText_numberOne);
        numberTwoEditText=(EditText)findViewById(R.id.editText_numberTwo);

        resultTextView=(TextView)findViewById(R.id.textView_result);

        addButton=(Button)findViewById(R.id.button_plus);
        subButton=(Button)findViewById(R.id.button_minus);
        multiplyButton=(Button)findViewById(R.id.button_multiply);
        divideButton=(Button)findViewById(R.id.button_divide);
        clearButton=(Button)findViewById(R.id.button_clear);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        double numberOneValue;
        double numberTwoValue;

        if(numberOneEditText.getText().toString().equals(""))
        {
            numberOneValue=0.00;
        }
        else
        {
            numberOneValue=Double.parseDouble(numberOneEditText.getText().toString());
        }

        if(numberTwoEditText.getText().toString().equals(""))
        {
            numberTwoValue=0.00;
        }
        else
        {
            numberTwoValue=Double.parseDouble(numberTwoEditText.getText().toString());
        }

        switch(view.getId())
        {
            case R.id.button_plus:
                result = numberOneValue + numberTwoValue;
                resultTextView.setText(String.format("%.2f", result));
                break;

            case R.id.button_minus:
                result = numberOneValue - numberTwoValue;
                resultTextView.setText(String.format("%.2f", result));
                break;
            case R.id.button_multiply:
                result = numberOneValue * numberTwoValue;
                resultTextView.setText(String.format("%.2f", result));
                break;
            case R.id.button_divide:
                result = numberOneValue / numberTwoValue;
                resultTextView.setText(String.format("%.2f", result));
                break;
            case R.id.button_clear:
                numberOneEditText.getText().toString().equals("");
                numberTwoEditText.getText().toString().equals("");
                result = 0.00;
                resultTextView.setText(String.format("%.2f", result));
                break;
        }
    }
}