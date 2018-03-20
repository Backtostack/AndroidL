package ru.startandroid.P0131_menusimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chb1, chb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chb1 = (CheckBox) findViewById(R.id.chbExtGroup);
        chb2 = (CheckBox) findViewById(R.id.chbExtItem);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(R.id.group1, chb1.isChecked());

        return super.onPrepareOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                Toast.makeText(this, getString(R.string.action_settings), Toast.LENGTH_SHORT).show();
                break;
             case R.id.action_item1:
                 Toast.makeText(this, getString(R.string.action_item1), Toast.LENGTH_SHORT).show();
                 break;
            case R.id.action_item2:
                 Toast.makeText(this, getString(R.string.action_item2), Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_item3:
                 Toast.makeText(this, getString(R.string.action_item3), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
