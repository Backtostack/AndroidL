package ru.startandroid.P0161_dynamiclayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linLayout = new LinearLayout(this);
        linLayout.setOrientation(LinearLayout.VERTICAL);
        ViewGroup.LayoutParams linLayoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        setContentView(linLayout, linLayoutParams);

        ViewGroup.LayoutParams linView = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);


        TextView tv = new TextView(this);
        tv.setText(R.string.TextView);
        tv.setLayoutParams(linView);
        linLayout.addView(tv);

        Button btn = new Button(this);
        btn.setText(R.string.Button);
        linLayout.addView(btn, linView);

        LinearLayout.LayoutParams leftMargin = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        leftMargin.leftMargin = 50;

        Button btnLinear = new Button(this);
        btnLinear.setText(R.string.Button);
        linLayout.addView(btnLinear, leftMargin);

        LinearLayout.LayoutParams GravityLL = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        GravityLL.gravity = Gravity.RIGHT;

        Button btnLL = new Button(this);
        btnLL.setText(R.string.Button);
        linLayout.addView(btnLL, GravityLL);
    }
}
