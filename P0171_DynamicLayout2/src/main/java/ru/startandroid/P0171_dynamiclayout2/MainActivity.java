package ru.startandroid.P0171_dynamiclayout2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioGroup rgGravity;
    LinearLayout linearLayoutTB;
    Button btnCreate;
    EditText etName;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);
        linearLayoutTB = (LinearLayout) findViewById(R.id.linearLayoutTB);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnClear = (Button) findViewById(R.id.btnClear);

        etName = (EditText) findViewById(R.id.etName);

        btnClear.setOnClickListener(this);
        btnCreate.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    }
}
