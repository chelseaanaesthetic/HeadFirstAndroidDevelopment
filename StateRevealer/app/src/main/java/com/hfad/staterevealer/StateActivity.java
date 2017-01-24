package com.hfad.staterevealer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class StateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView state = (TextView) findViewById(R.id.state_view);

        if (savedInstanceState == null) {
            state.setText("I am fresh!");
        }
        else {
            String previous = savedInstanceState.getString("state");
            state.setText(previous + "\n\nI was restored from a Bundle!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_state, menu);
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

    @Override
    protected void onRestart() {
        super.onRestart();
        TextView state = (TextView) findViewById(R.id.state_view);
        String previous = state.getText().toString();
        state.setText(previous + "\nI was restarted!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView state = (TextView) findViewById(R.id.state_view);
        String previous = state.getText().toString();
        state.setText(previous + "\nI was started!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView state = (TextView) findViewById(R.id.state_view);
        String previous = state.getText().toString();
        state.setText(previous + "\nI was resumed!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView state = (TextView) findViewById(R.id.state_view);
        String previous = state.getText().toString();
        state.setText(previous + "\nI was paused!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView state = (TextView) findViewById(R.id.state_view);
        String previous = state.getText().toString();
        state.setText(previous + "\nI was stopped!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextView state = (TextView) findViewById(R.id.state_view);
        String previous = state.getText().toString();
        state.setText(previous + "\nI was destroyed!");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        TextView state_view = (TextView) findViewById(R.id.state_view);
        String state = state_view.getText().toString();
        savedInstanceState.putString("state", state);
    }
}
