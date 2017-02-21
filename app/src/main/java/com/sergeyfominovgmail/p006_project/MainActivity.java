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
    public MainActivity btnClick;

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

        int idListbtn[] = {
                R.id.btn1,
                R.id.btn2,
                R.id.btn3,
                R.id.btn4,
                R.id.btn5,
                R.id.btn6,
                R.id.btn7,
                R.id.btn8,
                R.id.btn9
        };
        for(int id:idListbtn){
            View v = (View) findViewById(id);
            v.setOnClickListener(btnClick);
        }
    }

    @Override
    public void onClick(View v) {

        float num1 = 0;
        float num2 = 0;
        float result = 0;

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
            default:
                String numb = ((Button) v).getText().toString();
                getKeyboard(numb);
                break;
        }
        Result.setText(num1 + " " + oper + " " + num2 + "=" + result);
    }
    public void getKeyboard(String str){
        String scrCurrent = number1.getText().toString();
        scrCurrent += number1;
        number1.setText(scrCurrent);
    }
}
