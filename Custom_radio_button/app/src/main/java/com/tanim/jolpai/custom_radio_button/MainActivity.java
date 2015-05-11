package com.tanim.jolpai.custom_radio_button;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends Activity {

    RadioButton radioButton ;
    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton = (RadioButton) findViewById(R.id.radioButton);

    }


    @Override
    public void onResume(){
        super.onResume();

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean checked = ((RadioButton)v).isChecked();

                if (i == 0) {
                    //radioButton.setChecked(false);
                    i = 1;
                    Toast.makeText(MainActivity.this, "checked", Toast.LENGTH_SHORT).show();
                } else {
                    i = 0;
                    radioButton.setChecked(false);
                    Toast.makeText(MainActivity.this, "unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
