package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textResult;
    EditText etFirstNumber,etSecondNumber;
    Button btnPlus,btnMinous,btnMul,btnDivision,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //calculator

        textResult=findViewById(R.id.text_result);
        etFirstNumber=findViewById(R.id.et_first_number);
        etSecondNumber=findViewById(R.id.et_second_number);


       btnPlus=findViewById(R.id.btn_plus);
        btnMinous=findViewById(R.id.btn_minous);
        btnMul=findViewById(R.id.btn_mul);
        btnDivision=findViewById(R.id.btn_division);
        btnClear=findViewById(R.id.btn_clear);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etFirstNumber.getText().toString();
                String number2=etSecondNumber.getText().toString();

                    if(number1.isEmpty()&& number2.isEmpty())
                    {
                        Toast.makeText(MainActivity.this, "please enter digit", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        double value1=Double.parseDouble(number1);
                        double value2=Double.parseDouble(number2);
                        double result=value1+value2;
                        textResult.setText(""+result);

                    }

            }
        });
        btnMinous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etFirstNumber.getText().toString();
                String number2=etSecondNumber.getText().toString();

                if(number1.isEmpty()&& number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter digit", Toast.LENGTH_SHORT).show();
                }
                else{
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1-value2;
                    textResult.setText(""+result);

                }

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etFirstNumber.getText().toString();
                String number2=etSecondNumber.getText().toString();

                if(number1.isEmpty()&& number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter digit", Toast.LENGTH_SHORT).show();
                }
                else{
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1*value2;
                    textResult.setText(""+result);

                }

            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etFirstNumber.getText().toString();
                String number2=etSecondNumber.getText().toString();

                if(number1.isEmpty()&& number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter digit", Toast.LENGTH_SHORT).show();
                }
                else{
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1/value2;
                    textResult.setText(""+result);

                }

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResult.setText("Result");
                etFirstNumber.setText("");
                etSecondNumber.setText("");
            }
        });




    }
}