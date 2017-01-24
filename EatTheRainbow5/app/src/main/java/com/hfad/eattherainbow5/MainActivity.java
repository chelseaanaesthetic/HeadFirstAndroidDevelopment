package com.hfad.eattherainbow5;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        String foodList = expert.getFoods(foodColor, foodType);

        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            ListFoodFragment foods = new ListFoodFragment();
            foods.setFood(foodList);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, foods);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, LearnMoreActivity.class);
            intent.putExtra(LearnMoreActivity.FOODS_LIST, foodList);
            startActivity(intent);
        }
    }
}
