package ru.startandroid.P0111_resvalues;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity_old extends AppCompatActivity  {
    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        //Найдем наши кнопки
        LinearLayout llBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        //Установим надпись кнопки
        btnBottom.setText(R.string.Button);
        tvBottom.setText(R.string.tvBottomText);
        //Установим цвет кнопки
        llBottom.setBackgroundResource(R.color.llBottomColor);
        //Обработчик для смены картинки кнопки
        btnBottom.setOnClickListener(new View.OnClickListener() {
            //Обработчик нажатия кнопки
            @Override
            public void onClick(View v) {
                if (flag)
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_camera_black_48dp));
                else
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_add_a_photo_black_48dp));
                flag=! flag;
            }
        });
    }


}
