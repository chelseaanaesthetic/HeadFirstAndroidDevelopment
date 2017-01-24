package com.hfad.vegeasy;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HealthCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_category);

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

}
