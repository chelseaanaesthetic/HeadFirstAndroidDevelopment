package com.hfad.vegeasy;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NutritionalConcernsCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
}
