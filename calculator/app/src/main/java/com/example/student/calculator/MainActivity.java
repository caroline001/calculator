package com.example.student.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    //Global variable
    private EditText etNumberOne;
    private EditText etNumberTwo;
    private int operationType;
    private TextView tvResult,strNumberOne,strNumberTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etNumberOne = (EditText) findViewById(R.id.etNumberOne);
        EditText etNumberTwo = (EditText) findViewById(R.id.editText2);
        final TextView tvResult = (TextView) findViewById(R.id.tvResult);
        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        RadioButton addition = (RadioButton) findViewById(R.id.rbAddition);
        addition.setOnCheckedChangeListener(this);
        RadioButton subtraction = (RadioButton) findViewById(R.id.rbSubtraction);
        subtraction.setOnCheckedChangeListener(this);
        RadioButton multiplication = (RadioButton) findViewById(R.id.rbmultiplication);
        multiplication.setOnCheckedChangeListener(this);

        //Gettting values in the editText
        String strNumberOne = etNumberOne.getText().toString();
        String strNumberTwo = etNumberTwo.getText().toString();

        //converting string to integer
        int NumberOne = Integer.parseInt(strNumberOne);
        int NumberTwo = Integer.parseInt(strNumberTwo);
        //Checking which radioButton has been selected
        if (operationType == 1) {
            //performs addition and display the result
            //tvResult.setText();

        }
       if (operationType == 2) {
            if (operationType == 3) {
            //performs subtraction and displays result

        }
            //performs multiplication and displays the result

        }

        final int Result = NumberOne + NumberTwo;

        btnCalculate.setOnClickListener(this);

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()) {
            case R.id.rbAddition:
            case R.id.rbSubtraction:
                break;
            case R.id.rbmultiplication:
                break;


        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCalculate) {
            String strNumberOne = etNumberOne.getText().toString();
            String strNumberTwo = etNumberTwo.getText().toString();


            int numberOne = Integer.parseInt(strNumberOne);
            int numberTwo = Integer.parseInt(strNumberTwo);

            if (operationType == 1) {
                //performs addition and display the result
                int answer=addition(numberOne,numberTwo);
                tvResult.setText("Answer is:");
            }
            if (operationType == 2) {
                //performs subtraction and displays result
                int answer = subtraction(numberOne,numberTwo);
                tvResult.setText("Answer is:");
            }
            if (operationType == 3) {
                //performs multiplication and displays the result
                int answer= multiplication(numberOne,numberTwo);
                tvResult.setText("Answer is:");

            }
        }
    }

          public static int addition( int numberOne,int numberTwo){
            return numberOne + numberTwo ;
        }
            public static int subtraction(int numberOne,int numberTwo){
            return numberOne - numberTwo;
        }
            public static int multiplication(int numberOne,int numberTwo){
            return numberOne * numberTwo;
        }




}

