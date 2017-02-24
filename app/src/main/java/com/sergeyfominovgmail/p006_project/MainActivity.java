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

    private EditText Scr;
    //here was a mistake!
    public ButtonClickListener btnClick = new ButtonClickListener();
    private String operation;
    private float nBF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scr = (EditText) findViewById(R.id.number1);
        int idListbtn[] = {R.id.btn1, R.id.btn2, R.id.btn4, R.id.btn5, R.id.btn6,
                R.id.btn10, R.id.btn14, R.id.btn15,
                R.id.btn17, R.id.btn18, R.id.btn19,
                R.id.btnPlus, R.id.btnMinus, R.id.btnUmn,
                R.id.btnDelit, R.id.buttonEq
        };
        for (int id : idListbtn) {
            View v = (View) findViewById(id);
            v.setOnClickListener(btnClick);
        }
    }
    public void getKeyboard(String strq) {
        String scrCq = Scr.getText().toString();
        scrCq += strq;
        Scr.setText(scrCq);
    }
    public void mResult(){
        float numAf = Float.parseFloat(Scr.getText().toString());
        float result = 0;
        if(operation.equals("+")){
            result = numAf + nBF;
        }
        if(operation.equals("-")){
            result = numAf - nBF;
        }
        if(operation.equals("*")){
            result = numAf * nBF;
        }
        if(operation.equals("/")){
            result = numAf / nBF;
        }
        Scr.setText(String.valueOf(result));
    }
    public void mMath(String string){
        nBF = Float.parseFloat(Scr.getText().toString());
        operation = string;
        Scr.setText("0");

    }
    public class ButtonClickListener implements View.OnClickListener{
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnPlus:
                    mMath("+");
                    break;
                case R.id.btnMinus:
                    mMath("+");
                    break;
                case R.id.btnUmn:
                    mMath("*");
                    break;
                case R.id.btnDelit:
                    mMath("/");
                    break;
                case R.id.buttonEq:
                    mResult();
                    break;
                default:
                    String numb = ((Button) v).getText().toString();
                    getKeyboard(numb);
                    break;
            }
        }
    }
}
