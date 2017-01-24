package com.hfad.vegeasy;

public class NutritionalConcerns {
    private String name;
    private String description;

    public static final NutritionalConcerns[] concerns = {
            new NutritionalConcerns("Protein", "Placeholder text for description on vegan Protein sources"),
            new NutritionalConcerns("Calcium", "Placeholder text for description on vegan Calcium sources"),
            new NutritionalConcerns("B12", "Placeholder text for description on vegan Vitamin B12 sources"),
            new NutritionalConcerns("Vitamin D", "Placeholder text for description on vegan Vitamin D sources")
    };

    private NutritionalConcerns(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}
