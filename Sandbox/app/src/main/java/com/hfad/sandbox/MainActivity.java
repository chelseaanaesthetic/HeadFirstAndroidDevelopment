package com.hfad.sandbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static CharSequence text = "This is a toast";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    public void onButtonClicked(View view) {
        int duration = Toast.LENGTH_SHORT;
        CharSequence sample;

        switch (view.getId()) {
            case R.id.toggleButton:
                text = "Clicked: A toggle button";
                break;

            case R.id.switch1:
                text = "Clicked: A switch";
                break;

            case R.id.checkBox:
            case R.id.checkBox2:
                sample = "Clicked: A check box";
                if (text != sample) {
                    text = sample;
                }
                else {
                    text = "Clicked: Another check box";
                }
                break;

            case R.id.radioButton:
            case R.id.radioButton2:
                sample = "Clicked: A radio button";
                if (text != sample) {
                    text = sample;
                }
                else {
                    text = "Clicked: Another radio button";
                }
                break;

            case R.id.button:
                text = "Clicked: A button with an image";
                break;

            case R.id.imageButton:
                text = "Clicked: An image button";
                break;
            case R.id.foxView:
                text = "What does the fox say?";
                break;
        }

        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

}
