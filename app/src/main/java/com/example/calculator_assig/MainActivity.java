package com.example.calculator_assig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText Number1,Number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        Number1 = findViewById(R.id.Number1);
        Number2= findViewById(R.id.Number2);


    }
    public void addNumber(View v)
    {
        double n1,n2,sum,sub;

        n1 = Double.parseDouble(Number1.getText().toString());
        n2 = Double.parseDouble(Number2.getText().toString());

        sum = n1 + n2;
        result.setText(String.valueOf(sum));
    }

    public void subNumber(View v)
    {
        double n1,n2,sub;

        n1 = Double.parseDouble(Number1.getText().toString());
        n2 = Double.parseDouble(Number2.getText().toString());

        sub = n1 - n2;
        result.setText(String.valueOf(sub));
    }

    public void multiplyNumber(View v)
    {
        double n1,n2,multi;
        n1 = Double.parseDouble(Number1.getText().toString());
        n2 = Double.parseDouble(Number2.getText().toString());

        multi = n1 * n2;
        result.setText(String.valueOf(multi));
    }
    public void divideNumber(View v)
    {
        double n1,n2,div;

        n1 = Double.parseDouble(Number1.getText().toString());
        n2 = Double.parseDouble(Number2.getText().toString());

        div = n1 / n2;
        result.setText(String.valueOf(div));
    }
    public void modNumber(View v)
    {
        double n1,n2,mod;
        n1 = Double.parseDouble(Number1.getText().toString());
        n2 = Double.parseDouble(Number2.getText().toString());

        mod = n1 % n2;
        result.setText(String.valueOf(mod));
    }

}