package com.sergeyfominovgmail.p006_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlus, btnMinus, btnUmn, btnDelit, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    Button btn9;
    EditText number1, number2;

    TextView Result, numbers;
    String oper="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnUmn = (Button) findViewById(R.id.btnUmn);
        btnDelit = (Button) findViewById(R.id.btnDelit);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);

        Result = (TextView) findViewById(R.id.Result);
        numbers = (TextView) findViewById(R.id.numbers);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnUmn.setOnClickListener(this);
        btnDelit.setOnClickListener(this);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(MainActivity.this,"Pressed Button 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(MainActivity.this,"Pressed Button 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(MainActivity.this,"Pressed Button 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(MainActivity.this,"Pressed Button 4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(MainActivity.this,"Pressed Button 5",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                Toast.makeText(MainActivity.this,"Pressed Button 6",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn7:
                Toast.makeText(MainActivity.this,"Pressed Button 7",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn8:
                Toast.makeText(MainActivity.this,"Pressed Button 8",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn9:
                Toast.makeText(MainActivity.this,"Pressed Button 9",Toast.LENGTH_SHORT).show();
                break;
        }

        float num1 = 0;
        float num2 = 0;
        float result = 0;

        int button1 = 1;

        if(TextUtils.isEmpty(number1.getText().toString()) || TextUtils.isEmpty(number2.getText().toString())){
            return;
        }

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        switch (v.getId()){
            case R.id.btnPlus:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnMinus:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnUmn:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDelit:
                oper = "/";
                result = num1 / num2;
                break;
        }
        Result.setText(num1 + " " + oper + " " + num2 + "=" + result);
    }
}
