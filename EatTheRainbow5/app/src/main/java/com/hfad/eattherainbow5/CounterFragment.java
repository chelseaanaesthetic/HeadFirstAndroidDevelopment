package com.hfad.eattherainbow5;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CounterFragment extends Fragment implements View.OnClickListener {

    public FoodJournal fj;
    public TextView dailyTotals;

    public CounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_counter, container, false);

        Button counterButton = (Button)layout.findViewById(R.id.counter_button);
        counterButton.setOnClickListener(this);

        fj = FoodJournal.getInstance();

        dailyTotals = (TextView)layout.findViewById(R.id.dailyTotals);
        setText();
        // Inflate the layout for this fragment
        return layout;
    }

    @Override
    public void onClick(View v) {
        fj.setFoodTotal(FoodExpert.getIndex());
        setText();
    }

    private void setText(){
        dailyTotals.setText("Today's total for " + FoodExpert.getName() + " is "
                + fj.getFoodTotal(FoodExpert.getIndex()));
    }

}
