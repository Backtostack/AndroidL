package ru.startandroid.P0171_dynamiclayout2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rgGravity;
    Button btnCreate;
    EditText etName;
    Button btnClear;
    LinearLayout llMain;
    Button btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);

        llMain = (LinearLayout) findViewById(R.id.llMain);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);
        btnCount = (Button) findViewById(R.id.btnCount);
        btnCount.setOnClickListener(this);


        etName = (EditText) findViewById(R.id.etName);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCreate:
                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                int btnGravity = Gravity.LEFT;
                int CountItem = 0;

                switch (rgGravity.getCheckedRadioButtonId()) {
                    case R.id.rbLeft:
                        /*btnGravity = Gravity.LEFT;*/
                        lParams.gravity = Gravity.LEFT;
                        break;
                    case R.id.rbCenter:
                        btnGravity = Gravity.CENTER_HORIZONTAL;
                        break;
                    case R.id.rbRight:
                        btnGravity = Gravity.RIGHT;
                        break;
                }
                lParams.gravity = btnGravity;
                if (etName.getText().length() == 0) {
                    Toast.makeText(MainActivity.this, "Напишите имя кнопки", Toast.LENGTH_SHORT).show();
                } else {
                    Button btnNew = new Button(this);
                    btnNew.setText(etName.getText().toString());
                    llMain.addView(btnNew, lParams);
                    etName.setText(null);
                    btnNew.setOnClickListener(this);
                }
                break;
            case R.id.btnClear:
                llMain.removeAllViews();
                Toast.makeText(MainActivity.this, "Все удалено!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCount:
                CountItem = llMain.getChildCount();
                Toast.makeText(MainActivity.this, "Количество кнопок " + CountItem, Toast.LENGTH_SHORT).show();
                break;
            /*default:
                if (v.getId() >= 0 || v.getId() <= llMain.getChildCount()) {
                    Toast.makeText(MainActivity.this, "You pressed on" + Integer.toString(v.getId()) + " button", Toast.LENGTH_SHORT).show();
                    btnNew = (Button) findViewById(v.getId());
                    btnNew.setBackgroundColor(Color.BLUE);//знайшли кнопку а тепер робим шо хочем
                }*/
        }

    }
}