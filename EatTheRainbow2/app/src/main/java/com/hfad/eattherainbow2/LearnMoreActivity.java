package com.hfad.eattherainbow2;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class LearnMoreActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String FOODS_LIST = "foods list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        ArrayList<String> foodList = intent.getStringArrayListExtra(FOODS_LIST);

        Button button1 = (Button)findViewById(R.id.food1);
        button1.setText(foodList.get(0));
        button1.setOnClickListener(this);

        Button button2 = (Button)findViewById(R.id.food2);
        button2.setText(foodList.get(1));
        button2.setOnClickListener(this);

        Button button3 = (Button)findViewById(R.id.food3);
        button3.setText(foodList.get(2));
        button3.setOnClickListener(this);

        Button button4 = (Button)findViewById(R.id.food4);
        button4.setText(foodList.get(3));
        button4.setOnClickListener(this);

        Button button5 = (Button)findViewById(R.id.food5);
        button5.setText(foodList.get(4));
        button5.setOnClickListener(this);
    }


    public void onClick(View view) {

        String food = "food";

        switch (view.getId()) {
            case R.id.food1:
                food = ((Button)findViewById(R.id.food1)).getText().toString();
                break;
            case R.id.food2:
                food = ((Button)findViewById(R.id.food2)).getText().toString();
                break;
            case R.id.food3:
                food = ((Button)findViewById(R.id.food3)).getText().toString();
                break;
            case R.id.food4:
                food = ((Button)findViewById(R.id.food4)).getText().toString();
                break;
            case R.id.food5:
                food = ((Button)findViewById(R.id.food5)).getText().toString();
                break;
            default:
                food = "produce";
                break;
        }

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, food);
        startActivity(intent);
    }
}
