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
        //getChildCount() я так понял, что он возвращает количество подвидов в нашем инте count. Returns the number of children in the group. eto int
        int count = relativeLayout.getChildCount();
        //потом мы обрабатываем класс private BCH
        ButtonClickHandler buttonClickHandler = new ButtonClickHandler();
        for(int i=0; i<count; i++){
            //я так понял что метод getChildAt Возвращает представление в указанной позиции в группе.
            View v = relativeLayout.getChildAt(i);
            //Ключевое слово является бинарным оператором используется для проверки, если объект (экземпляр) является подтипом данного типа. eto instanceof
            //кароче, если это подтип типа, то он возвращает значение true
            if(v instanceof Button){
                //а здесь возвращаем наше значение, когда мы кликаем
                v.setOnClickListener(buttonClickHandler);
            }
        }
    }
    private class ButtonClickHandler implements View.OnClickListener
    {
        @Override
        public void onClick(View view){

            TextView textViewOutputScreen = (TextView) findViewById(R.id.textView);
            //очищаем текст, если мы нажали на С
            if(view.getId() == R.id.buttonClear){
                textViewOutputScreen.setText("0");
            }
            else if (view instanceof Button){
                Button buttonClicked = (Button)view;

                //equals - Указывает, является ли какой-либо другой объект "равно" этот. Indicates whether some other object is "equal to" this one.
                //здесь при цифре = 0, когда мы вводим другое число не будет вот так 05, а будет просто 5. 0 исчезает.
                if (textViewOutputScreen.getText().equals("0")) {
                    textViewOutputScreen.setText("");
                }
                //сердце операции. когда мы присвоили buttonclicked - view, и добавили к нему окошко textView, то остается только к получаемому тексту добавлять текст + string btnClicked
                //и все это происходит через getText
                textViewOutputScreen.setText(textViewOutputScreen.getText().toString()+buttonClicked.getText());
            }
        }
    }
}
