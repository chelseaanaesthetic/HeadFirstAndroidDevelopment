package com.hfad.eattherainbow5;

import java.util.Calendar;

public class FoodJournal {

    private static FoodJournal instance = new FoodJournal();
    private static int[] foodTotals;
    private static Calendar currentDate;

    private FoodJournal() {
        if (currentDate != null && (currentDate).equals(Calendar.getInstance())) {

        }
        else {
            currentDate = Calendar.getInstance();
            foodTotals = new int[12];
            for (int i = 0; i < 12; i++) {
                foodTotals[i] = 0;
            }
        }
    }

    public static FoodJournal getInstance() {
        return instance;
    }

    public static int getFoodTotal(int index) {
        return foodTotals[index];
    }

    public static void setFoodTotal(int index) {
        foodTotals[index] += 1;
    }
}
