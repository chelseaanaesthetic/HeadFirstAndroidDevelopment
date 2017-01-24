package com.hfad.workout;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.FragmentTransaction;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {
    private long workoutID;

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            workoutID = savedInstanceState.getLong("workoutId");
        }
        else {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            StopwatchFragment stopwatchFragment = new StopwatchFragment();
            ft.replace(R.id.stopwatch_container, stopwatchFragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if (view != null) {

            //Create a cursor
            try {
                SQLiteOpenHelper workoutDatabaseHelper = new WorkoutDatabaseHelper(getActivity());
                SQLiteDatabase db = workoutDatabaseHelper.getReadableDatabase();
                Cursor cursor = db.query("WORKOUT",
                        new String[]{"NAME", "DESCRIPTION"},
                        "_id = ?",
                        new String[]{Long.toString(workoutID)},
                        null, null, null);

                //Move to the first record in the Cursor
                if (cursor.moveToFirst()) {
                    String nameText = cursor.getString(0);
                    String descriptionText = cursor.getString(1);

                    TextView title = (TextView) view.findViewById(R.id.textTitle);
                    title.setText(nameText);
                    TextView description = (TextView) view.findViewById(R.id.textDescription);
                    description.setText(descriptionText);
                }

                cursor.close();
                db.close();

            } catch(SQLiteException e) {
                Toast toast = Toast.makeText(getActivity(), "Database unavailable", Toast.LENGTH_SHORT);
                toast.show();
            }


        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("workoutId", workoutID);
    }

    public void setWorkout(long id) {
        this.workoutID = id;
    }

}
