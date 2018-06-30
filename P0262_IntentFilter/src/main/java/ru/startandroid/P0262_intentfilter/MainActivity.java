package ru.startandroid.P0262_intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTime;
    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDate = (Button) findViewById(R.id.btnDate);
        btnTime = (Button) findViewById(R.id.btnTime);

        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent; //Ссылка типа Intent
        switch (v.getId()) { // Получаем ID нажатой View
            case R.id.btnDate: // Если возвращаеться True, выполняем условие
                intent = new Intent("ru.startandroid.intent.action.showdate");
                startActivity(intent);
                break;
            case R.id.btnTime:
                intent = new Intent("ru.startandroid.intent.action.showtime");
                startActivity(intent);
                break;
        }
    }
}
