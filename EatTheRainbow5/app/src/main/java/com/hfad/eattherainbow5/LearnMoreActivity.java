package com.hfad.eattherainbow5;

import android.app.Activity;
import android.os.Bundle;

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
