package ru.startandroid.p0211_twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnActTwo;
    Button btnActThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActTwo.setOnClickListener(this);
        btnActThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, Activity_two.class);
                startActivity(intent);
                break;
            case R.id.btnActThree:
                Intent intent1 = new Intent(this, ActivityThree.class);
                startActivity(intent1);
                break;
        }


    }
}
