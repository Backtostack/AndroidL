package ru.startandroid.P0191_simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    EditText etNum1;
    EditText etNum2;

    /*Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;*/

    TextView tvResult;

    String oper = "";

    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Находим элементы
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        /*btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);*/

        tvResult = (TextView) findViewById(R.id.tvResult);
        //Присваемаем обработчик кнопкам
        /*btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMult.setOnClickListener(this);*/
    }

    /*@Override*/
    public void myClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        /// Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }
        // читаем EditText и заполняем переменные числами
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());
        //
        switch (v.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDiv:
                if (num2 == 0) {
                    Toast.makeText(this, "Деление на ноль недопустимо", Toast.LENGTH_SHORT).show();
                    return;
                }
                oper = "/";
                result = num1 / num2;
                break;
            default:
                break;
        }
        tvResult.setText(num1 + oper + num2 + "=" + result);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_RESET_ID, 0, "Reset");
        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case MENU_RESET_ID:
                // очищаем поля
                etNum1.setText("");
                etNum2.setText("");
                tvResult.setText("");
                break;
            case MENU_QUIT_ID:
                //Выходим из приложения
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
