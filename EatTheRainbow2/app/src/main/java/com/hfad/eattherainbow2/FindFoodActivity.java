package com.hfad.eattherainbow2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FindFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_food);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_food, menu);
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

    // Call when the user clicks the button
    public void onClickFindFoods(View view) {
        FoodExpert expert = new FoodExpert();


        // Get references to the Spinners
        Spinner color = (Spinner) findViewById(R.id.color);
        Spinner type = (Spinner) findViewById(R.id.type);

        // Get the selected items in the Spinners
        String foodColor = String.valueOf(color.getSelectedItem());
        String foodType = String.valueOf(type.getSelectedItem());

        // Get recommendations from the FoodExpert class
        ArrayList<String> foodList = expert.getFoods(foodColor, foodType);

        Intent intent = new Intent(this, LearnMoreActivity.class);
        intent.putStringArrayListExtra(LearnMoreActivity.FOODS_LIST, foodList);
        startActivity(intent);
    }
}
