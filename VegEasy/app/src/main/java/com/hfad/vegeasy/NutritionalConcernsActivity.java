package com.hfad.vegeasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NutritionalConcernsActivity extends AppCompatActivity {

    public static final String EXTRA_CONCERNNO = "concernNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutritional_concerns);

        int concernNo = (Integer)getIntent().getExtras().get(EXTRA_CONCERNNO);
        NutritionalConcerns concern = NutritionalConcerns.concerns[concernNo];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(concern.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(concern.getDescription());
    }
}
