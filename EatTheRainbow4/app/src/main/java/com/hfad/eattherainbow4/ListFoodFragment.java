package com.hfad.eattherainbow4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFoodFragment extends Fragment {

    private String foodList;

    public ListFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (savedInstanceState != null) {
            foodList = savedInstanceState.getString("foodList");
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_food, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView examples = (TextView) view.findViewById(R.id.foods);
            examples.setText(foodList);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("foodList", foodList);
    }

    public void setFood(String foodList) {
        this.foodList = foodList;
    }

}
