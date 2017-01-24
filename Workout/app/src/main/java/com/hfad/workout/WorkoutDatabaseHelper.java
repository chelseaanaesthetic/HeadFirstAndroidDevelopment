package com.hfad.workout;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WorkoutDatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "workout";
    private static final int DB_VERSION = 3;

    WorkoutDatabaseHelper (Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static void insertWorkout(SQLiteDatabase db, String name, String description) {
        ContentValues workoutValues = new ContentValues();
        workoutValues.put("NAME", name);
        workoutValues.put("DESCRIPTION", description);
        db.insert("WORKOUT", null, workoutValues);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE WORKOUT ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT);");
            insertWorkout(db, "The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups");
            insertWorkout(db, "Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats");
            insertWorkout(db, "The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats");
        }
        if (oldVersion < 2) {
            insertWorkout(db, "Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups");
        }
        if (oldVersion < 3) {
            db.execSQL("ALTER TABLE WORKOUT ADD COLUMN FAVORITE NUMERIC;");
        }
    }
}
