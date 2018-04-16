package ru.startandroid.P0161_dynamiclayout;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        //Создаем LinearLayout
        LinearLayout linLayout = new LinearLayout(this);
        //Установим вертикальную ориентацию
        linLayout.setOrientation(LinearLayout.VERTICAL);
        //Создаем LayoutParams
        /*ViewGroup.LayoutParams linLayoutParams = new ViewGroup.LayoutParams()*/


    }
}
