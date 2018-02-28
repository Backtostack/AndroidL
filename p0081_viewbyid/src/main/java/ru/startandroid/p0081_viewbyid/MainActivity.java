package ru.startandroid.p0081_viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView myTextView = (TextView) findViewById(R.id.MyText);
        myTextView.setText("Andorid it's easy :)");

        Button myBtn = (Button) findViewById(R.id.button);
        myBtn.setText("My button");
        myBtn.setEnabled(false);

        CheckBox MyChb = (CheckBox) findViewById(R.id.checkBox2);
        MyChb.setChecked(true);
    }
}
