package ru.startandroid.P0131_menusimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        /*Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();*/
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
        /*if (id == R.id.action_settings){
            Toast.makeText(this, getString(R.string.action_settings), Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_item1){
            Toast.makeText(this, getString(R.string.action_item1), Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_item2){
            Toast.makeText(this, getString(R.string.action_item2), Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.action_item3){
            Toast.makeText(this, getString(R.string.action_item3), Toast.LENGTH_SHORT).show();
        }*/
            /*return true;*/
        return super.onOptionsItemSelected(item);
    }

    /*public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub

        menu.add("Settings");
        menu.add("OpenVideo");
        menu.add("OpenAudio");
        menu.add("OpenPhoto");

        return super.onCreateOptionsMenu(menu);
    }*/
}

