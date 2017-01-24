package com.hfad.vegeasy2;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ShareActionProvider;
import android.widget.Toast;

public class HealthCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_category);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Make an OnItemClickListener that Toasts when you click on an item.
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(HealthCategoryActivity.this, NutritionalConcernsCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        // Set the top-level ListView's item click listener to OnItemClickListener created above.
        ListView listView = (ListView) findViewById(R.id.health_options);
        listView.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Add menu_main items to the action bar (if present):
        getMenuInflater().inflate(R.menu.menu_health, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_environment:
                Toast.makeText(HealthCategoryActivity.this, "For the Environment!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_animals:
                Toast.makeText(HealthCategoryActivity.this, "For the Animals!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_food:
                Toast.makeText(HealthCategoryActivity.this, "For the Food!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                //Code to run when the settings item is clicked
                Toast.makeText(HealthCategoryActivity.this, "Settings!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
