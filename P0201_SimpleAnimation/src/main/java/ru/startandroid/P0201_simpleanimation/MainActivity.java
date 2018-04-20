package ru.startandroid.P0201_simpleanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // константы для ID пунктов меню
    final int MY_ALPHA_ID = 1;
    final int MY_SCALE_ID = 2;
    final int MY_TRANS_ID = 3;
    final int MY_ROTATE_ID = 4;
    final int MY_COMBO_ID = 5;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Находим TextView
        tv = (TextView) findViewById(R.id.tv);
        /*// регистрируем контекстное меню для компонента tv
        registerForContextMenu(tv);*/
    }
    /*@Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            // добавляем пункты
            case R.menu.menu
            *//*case R.id.tv:
                menu.add(0, MY_ALPHA_ID, 1, "alpha");
                menu.add(0, MY_SCALE_ID, 2, "scale");
                menu.add(0, MY_TRANS_ID, 3, "translate");
                menu.add(0, MY_ROTATE_ID, 4, "rotate");
                menu.add(0, MY_COMBO_ID, 5, "combo");
                break;*//*
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    /*@Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        return super.onPrepareOptionsMenu(menu);
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Animation anim = null;
        switch (item.getItemId()) {
            case R.id.MY_ALPHA_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case R.id.MY_SCALE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case R.id.MY_TRANS_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
            case R.id.MY_ROTATE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case R.id.MY_COMBO_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;
        }
        tv.startAnimation(anim);
        return super.onOptionsItemSelected(item);
    }
    /*@Override
    public boolean onContextItemSelected(MenuItem item) {
        Animation anim = null;
        // определяем какой пункт был нажат
        switch (item.getItemId()) {
            case MY_ALPHA_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case MY_SCALE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case MY_TRANS_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
            case MY_ROTATE_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case MY_COMBO_ID:
                anim = AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;

        }
        tv.startAnimation(anim);
        return super.onContextItemSelected(item);
    }*/
}
