package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Definition
         number1Text = findViewById(R.id.firstValue);

         number2Text = findViewById(R.id.secondValue);

         resultText = findViewById(R.id.resultText);



    }

    //Summation Process
    public void sum(View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Attention! Missing value! Check the values and try again!");

        }
        else
        {
            int number1 =  Integer.parseInt(number1Text.getText().toString());
            int number2 =  Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("result:" + result);
        }




        //Deduct Process
    }
    public void deduct(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Attention! Missing value! Check the values and try again!");

        }
        else
        {
            int number1 =  Integer.parseInt(number1Text.getText().toString());
            int number2 =  Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("result:" + result);
        }

    }
        //Multiply process
    public void multiply(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Attention! Missing value! Check the values and try again!");

        }   else {
            int number1 =  Integer.parseInt(number1Text.getText().toString());
            int number2 =  Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            resultText.setText("result:" + result);
        }


    }
        //Divide Process
    public void divide(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){

            resultText.setText("Attention! Missing value! Check the values and try again!");

        }
        else
        {
            int number1 =  Integer.parseInt(number1Text.getText().toString());
            int number2 =  Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;

            resultText.setText("result:" + result);
        }


    }



}