package ru.startandroid.P0091_onclickbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        //Найдем View элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        // создаем обработчик нажатия
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Меняем текст в TextView (tvOut)
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        // присвоим обработчик кнопке OK (btnOk)
        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(this);

//        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Меняем текст в TextView (tvOut)
//                tvOut.setText("Нажата кнопка Cansel");
//            }
//        };
        // присвоим обработчик кнопке OK (btnOk)
//        btnCancel.setOnClickListener(oclBtnCancel);   s

    }
    @Override
    public void onClick(View v) {
        tvOut.setText("Нажата кнопка Cansel");
    }
    public void LessonClick (View view){
        tvOut.setText("Нажата кнопка Lesson");
    }
}
