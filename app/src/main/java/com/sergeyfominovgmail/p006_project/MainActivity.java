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

    Button btnPlus, btnMinus, btnUmn, btnDelit;
    EditText number1, number2;

    TextView Result;
    String oper="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnUmn = (Button) findViewById(R.id.btnUmn);
        btnDelit = (Button) findViewById(R.id.btnDelit);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);

        Result = (TextView) findViewById(R.id.Result);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnUmn.setOnClickListener(this);
        btnDelit.setOnClickListener(this);
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
        }

        Result.setText(num1 + " " + oper + " " + num2 + "=" + result);
    }
}
