package com.hfad.vegeasy2;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;

public class NutritionalConcernsActivity extends Activity {

    public static final String EXTRA_CONCERNNO = "concernNo";
    private ShareActionProvider shareActionProvider;
    private String shareText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritional_concerns);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int concernNo = (Integer)getIntent().getExtras().get(EXTRA_CONCERNNO);
        NutritionalConcerns concern = NutritionalConcerns.concerns[concernNo];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(concern.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(concern.getDescription());

        shareText = concern.getDescription();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Add menu_main items to the action bar (if present):
        getMenuInflater().inflate(R.menu.menu_deepest, menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
        setIntent(shareText);
        return super.onCreateOptionsMenu(menu);
    }

    private void setIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_health:
                Toast.makeText(NutritionalConcernsActivity.this, "For Health!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this, HealthCategoryActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_environment:
                Toast.makeText(NutritionalConcernsActivity.this, "For the Environment!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_animals:
                Toast.makeText(NutritionalConcernsActivity.this, "For the Animals!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_food:
                Toast.makeText(NutritionalConcernsActivity.this, "For the Food!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                //Code to run when the settings item is clicked
                Toast.makeText(NutritionalConcernsActivity.this, "Settings!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
