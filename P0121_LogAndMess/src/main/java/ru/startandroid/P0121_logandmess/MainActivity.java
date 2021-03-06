package ru.startandroid.P0121_logandmess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    private static final String TAG = "myLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        // найдем View-элементы
        Log.d(TAG,"Найдем View-элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        // присваиваем обработчик кнопкам
        Log.d(TAG, "присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                // кнопка ОК
                Log.d(TAG, "Нажата кнопка ОК");
                tvOut.setText(R.string.НажатаКнопкаОК);
                Toast.makeText(this, R.string.НажатаКнопкаОК, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancel:
                // кнопка Cancel
                Log.d(TAG, "Нажата нопка Cancel");
                tvOut.setText(R.string.НажатаКнопкаCancel);
                Toast toast = Toast.makeText(this, R.string.НажатаКнопкаCancel, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,5,0);
                LinearLayout toastImage = (LinearLayout) toast.getView();
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.ic_3d_rotation_black_36dp);
                toastImage.addView(imageView, 0);
                toast.show();
                break;
        }

    }
}
