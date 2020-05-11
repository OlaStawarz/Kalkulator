package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnClear;
    private Button btnSum;
    private Button btnSubstract;
    private Button btnDivide;
    private Button btnMultiple;
    private Button btnDot;
    private Button btnEqual;
    private TextView textResult;

    float firstval, secondval;
    boolean sumClicked, substractClicked, divideClicked, multipleClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btnClear = (Button) findViewById(R.id.buttonClear);
        btnDivide = (Button) findViewById(R.id.buttonDivide);
        btnSubstract = (Button) findViewById(R.id.buttonSubstract);
        btnMultiple = (Button) findViewById(R.id.buttonMultiple);
        btnSum = (Button) findViewById(R.id.buttonSum);
        btnDot = (Button) findViewById(R.id.buttonDot);
        btnEqual = (Button) findViewById(R.id.buttonEqual);
        textResult = (TextView) findViewById(R.id.text);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText(textResult.getText() + "9");
            }
        });



        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstval = Float.parseFloat(textResult.getText() + "");
                sumClicked = true;
                textResult.setText(null);
            }
        });

        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstval = Float.parseFloat(textResult.getText() + "");
                substractClicked = true;
                textResult.setText(null);
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstval = Float.parseFloat(textResult.getText() + "");
                multipleClicked = true;
                textResult.setText(null);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstval = Float.parseFloat(textResult.getText() + "");
                divideClicked = true;
                textResult.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(sumClicked){
                    secondval = Float.parseFloat(textResult.getText() + "");
                    float result = firstval + secondval;
                    textResult.setText(result + "");
                }
                if(substractClicked){
                    secondval = Float.parseFloat(textResult.getText() + "");
                    float result = firstval - secondval;
                    textResult.setText(result + "");
                }
                if(multipleClicked){
                    secondval = Float.parseFloat(textResult.getText() + "");
                    float result = firstval * secondval;
                    textResult.setText(result + "");
                }
                if(divideClicked){
                    secondval = Float.parseFloat(textResult.getText() + "");
                    float result = firstval / secondval;
                    textResult.setText(result + "");
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText("");
            }
        });



    }



}
