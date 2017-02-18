package com.sergeyfominovgmail.p006_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //вызов черной надписи на ~ 2 секунды, оповещение типа.. прочитать про toast
//        final Button button7 = (Button) findViewById(R.id.button7);
//        button7.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                Toast.makeText(getApplicationContext(),"Java 7 button clicked C??" + ((Button)view).getText(), Toast.LENGTH_SHORT).show();
//            }
//        });

        //это понятно
        RelativeLayout relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayoutCalcular);
        //getChildCount() я так понял, что он возвращает количество подвидов в нашем инте count
        int count = relativeLayout.getChildCount();
        //потом мы обрабатываем класс private BCH
        ButtonClickHandler buttonClickHandler = new ButtonClickHandler();
        for(int i=0; i<count; i++){
            //здесь 
            View v = relativeLayout.getChildAt(i);
            if(v instanceof Button){
                v.setOnClickListener(buttonClickHandler);
            }
        }
    }

    private class ButtonClickHandler implements View.OnClickListener
    {
        @Override
        public void onClick(View view){
            if (view instanceof Button){
                Button buttonClicked = (Button)view;
                TextView textViewOutputScreen = (TextView) findViewById(R.id.textView);

                textViewOutputScreen.setText(textViewOutputScreen.getText().toString()+buttonClicked.getText());
            }
        }
    }
}
