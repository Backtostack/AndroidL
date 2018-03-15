package ru.startandroid.P0091_onclickbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener {
    private TextView tvOut;
    public Button btnOk;
    public Button btnCancel;
    public Button btnLesson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        //Найдем View элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnLesson = (Button) findViewById(R.id.btnLesson);
        // создаем обработчик нажатия
        /*btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }*/
        btnCancel.setOnClickListener(this);
        btnOk.setOnClickListener(this);
        btnLesson.setOnClickListener(this);
        }
//        View.OnClickListener oclBtnOk = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Меняем текст в TextView (tvOut)
//                tvOut.setText("Нажата кнопка ОК");
//            }
//        };
        // присвоим обработчик кнопке OK (btnOk)
//        btnOk.setOnClickListener(oclBtnOk);

        /*btnCancel.setOnClickListener(this);
        btnOk.setOnClickListener(this);*/


//        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Меняем текст в TextView (tvOut)
//                tvOut.setText("Нажата кнопка Cancel");
//            }
//        };
        // присвоим обработчик кнопке OK (btnOk)
//        btnCancel.setOnClickListener(oclBtnCancel);   s
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOk:
        tvOut.setText(R.string.OnOk);
                break;
            case R.id.btnCancel:
        tvOut.setText(R.string.OnCansel);
                break;
            case R.id.btnLesson:
        tvOut.setText(R.string.OnLesson);
                break;
        }
    }
}
