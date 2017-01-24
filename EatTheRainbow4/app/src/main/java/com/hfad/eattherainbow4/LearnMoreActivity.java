package com.hfad.eattherainbow4;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class LearnMoreActivity extends Activity {

    public static final String FOODS_LIST = "foods list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);

        ListFoodFragment listFoodFragment = (ListFoodFragment)
                getFragmentManager().findFragmentById(R.id.detail_frag);
        String foodList = (String) getIntent().getExtras().get(FOODS_LIST);
        listFoodFragment.setFood(foodList);
    }

}
