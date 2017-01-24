package com.hfad.eattherainbow;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindFoodActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_food);
    }

    // Call when the user clicks the button
    public void onClickFindFoods(View view) {
        FoodExpert expert = new FoodExpert();

        // Get a reference to the TextView
        TextView foods = (TextView) findViewById(R.id.foods);

        // Get references to the Spinners
        Spinner color = (Spinner) findViewById(R.id.color);
        Spinner type = (Spinner) findViewById(R.id.type);

        // Get the selected items in the Spinners
        String foodColor = String.valueOf(color.getSelectedItem());
        String foodType = String.valueOf(type.getSelectedItem());

        // Get recommendations from the FoodExpert class
        List<String> foodList = expert.getFoods(foodColor, foodType);
        StringBuilder foodsFormatted = new StringBuilder();
        for (String food : foodList) {
            foodsFormatted.append(food).append("\n");
        }

        // Display the foods
        foods.setText(foodsFormatted);
    }
}
