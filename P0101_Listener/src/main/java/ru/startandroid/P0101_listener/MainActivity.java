package ru.startandroid.P0101_listener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        //Найдем view - элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnOk:
                    tvOut.setText(R.string.btnOk);
                    break;
                case R.id.btnCancel:
                    tvOut.setText(R.string.btnCan);
                    break;
            }
            }
        };
        btnOk.setOnClickListener(onClickListener);
        btnCancel.setOnClickListener(onClickListener);
        tvOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOk.setText(R.string.textButton);
            }
        });
    }
}
