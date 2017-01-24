package com.hfad.vegeasy2;

import android.app.ActionBar;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ShareActionProvider;
import android.widget.Toast;

public class NutritionalConcernsCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ListView listNutritionalConcerns = getListView();
        ArrayAdapter<NutritionalConcerns> listAdapter = new ArrayAdapter<NutritionalConcerns>(
                this, android.R.layout.simple_list_item_1, NutritionalConcerns.concerns);
        listNutritionalConcerns.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(NutritionalConcernsCategoryActivity.this, NutritionalConcernsActivity.class);
        intent.putExtra(NutritionalConcernsActivity.EXTRA_CONCERNNO, (int) id);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Add menu_main items to the action bar (if present):
        getMenuInflater().inflate(R.menu.menu_deep, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_health:
                Toast.makeText(NutritionalConcernsCategoryActivity.this, "For Health!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, HealthCategoryActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_environment:
                Toast.makeText(NutritionalConcernsCategoryActivity.this, "For the Environment!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_animals:
                Toast.makeText(NutritionalConcernsCategoryActivity.this, "For the Animals!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_food:
                Toast.makeText(NutritionalConcernsCategoryActivity.this, "For the Food!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                //Code to run when the settings item is clicked
                Toast.makeText(NutritionalConcernsCategoryActivity.this, "Settings!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
