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

public class MainActivity extends AppCompatActivity{

    EditText number1;
    private ButtonClickListener btnClick;
    private String operation;
    private float nBF;

    TextView Result, numbers;
    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.number1);
        int idListbtn[] = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6,
                R.id.btn7, R.id.btn8, R.id.btn9, R.id.btnPlus, R.id.btnMinus, R.id.btnUmn,
                R.id.btnDelit, R.id.buttonEq
        };
        for (int id : idListbtn) {
            View v = (View) findViewById(id);
            v.setOnClickListener(btnClick);
        }
    }
    public void getKeyboard(String str) {
        String scrC = numbers.getText().toString();
        scrC += str;
        numbers.setText(scrC);
    }
    public void mResult(){
        float num = Float.parseFloat(numbers.getText().toString());
        float result = 0;
        if(operation.equals("+")){
            result = num + nBF;
        }
        if(operation.equals("-")){
            result = num - nBF;
        }
        if(operation.equals("*")){
            result = num * nBF;
        }
        if(operation.equals("/")){
            result = num / nBF;
        }
        number1.setText(String.valueOf(result));
    }
    public void mMath(String str){
        //save the screen
        nBF = Float.parseFloat(number1.getText().toString());
        //operation
        operation = str;
        //clear screen
        number1.setText("0");
    }
    public class ButtonClickListener implements View.OnClickListener{
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnPlus:
                    mMath("+");
                    break;
                case R.id.btnMinus:
                    mMath("-");
                    break;
                case R.id.btnUmn:
                    mMath("*");
                    break;
                case R.id.btnDelit:
                    mMath("/");
                    break;
                case R.id.buttonEq:
                    mResult();
                default:
                    String strj = ((Button) v).getText().toString();
                    getKeyboard(strj);
                    break;
            }
        }
    }
}
