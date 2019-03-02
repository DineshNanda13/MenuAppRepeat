package com.meterstoinches.menuapprepeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.eg_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent s = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(s);
                return true;
            case R.id.item2:
                Intent t = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(t);
                return true;
            case R.id.subitem1:
                Toast.makeText(getApplicationContext(),"In ankush, vivek selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(getApplicationContext(),"In ankush, jagdeep selected",Toast.LENGTH_LONG).show();
                return true;

                default:
                    return super.onOptionsItemSelected(item);

        }

    }
}
