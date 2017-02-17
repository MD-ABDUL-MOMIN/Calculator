package com.sergeyfominovgmail.p006_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //описание обьектов для того, чтомы иметь возможность обращаться к ним
    TextView textView;
    Button button1;
    Button button2;
    Button button3;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //инициализация обьектов из нашего layout activity_main
        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button15 = (Button) findViewById(R.id.button15);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button16 = (Button) findViewById(R.id.button16);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button1:
                        textView.setText("1");
                        break;
                    case R.id.button2:
                        textView.setText("4");
                        break;
                    case R.id.button3:
                        textView.setText("2");
                        break;
                    case R.id.button7:
                        textView.setText("3");
                        break;
                    case R.id.button8:
                        textView.setText("6");
                        break;
                    case R.id.button9:
                        textView.setText("5");
                        break;
                    case R.id.button10:
                        textView.setText("7");
                        break;
                    case R.id.button11:
                        textView.setText("8");
                        break;
                    case R.id.button12:
                        textView.setText("9");
                        break;
                    case R.id.button13:
                        textView.setText("+ -");
                        break;
                    case R.id.button14:
                        textView.setText("*");
                        break;
                    case R.id.button15:
                        textView.setText("=");
                        break;
                    case R.id.button16:
                        textView.setText("10");
                        break;
                }
            }
        };

        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        button10.setOnClickListener(onClickListener);
        button11.setOnClickListener(onClickListener);
        button12.setOnClickListener(onClickListener);
        button13.setOnClickListener(onClickListener);
        button14.setOnClickListener(onClickListener);
        button15.setOnClickListener(onClickListener);
        button16.setOnClickListener(onClickListener);
    }
}
