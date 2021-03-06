package ru.startandroid.P0111_resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvBottom;
    ImageView imageView;
    private static final String TAG = "myLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Log.d(TAG, "Найдем View элементы");
        //Найдем наши кнопки
        LinearLayout llBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        //Установим надпись кнопки
        btnBottom.setText(R.string.Button);
        tvBottom.setText(R.string.tvBottomText);
        //Установим цвет кнопки
        llBottom.setBackgroundResource(R.color.llBottomColor);
        btnBottom.setOnClickListener(this);
        //Обработчик для смены картинки кнопки
    }
    @Override
    public void onClick(View v) {
        tvBottom.setText("Нажата клавиша Смена картинки");
        Log.d(TAG, "Проверим работу обработчика");
    }
}
