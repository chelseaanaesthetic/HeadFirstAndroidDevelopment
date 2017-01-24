package com.hfad.eattherainbow2;
import java.util.ArrayList;
import java.util.List;

public class FoodExpert {
    ArrayList<String> getFoods(String color, String type) {
        ArrayList<String> foods = new ArrayList<String>();

        if (type.equals("fruits")) {
            switch (color) {
                case "red":
                    foods.add("cherry");
                    foods.add("pomegranate");
                    foods.add("raspberry");
                    foods.add("strawberry");
                    foods.add("watermelon");
                    break;
                case "orange":
                    foods.add("apricots");
                    foods.add("cantaloupe");
                    foods.add("mango");
                    foods.add("oranges");
                    foods.add("persimmons");
                    break;
                case "yellow":
                    foods.add("lemon");
                    foods.add("pear");
                    foods.add("pineapple");
                    foods.add("yellow apples");
                    foods.add("yellow figs");
                    break;
                case "green":
                    foods.add("green apples");
                    foods.add("green grapes");
                    foods.add("honeydew melon");
                    foods.add("kiwi");
                    foods.add("lime");
                    break;
                case "blue/purple":
                    foods.add("blueberries");
                    foods.add("blackberries");
                    foods.add("black currants");
                    foods.add("grapes");
                    foods.add("plums");
                    break;
                case "white":
                    foods.add("banana");
                    foods.add("coconut");
                    foods.add("dates");
                    foods.add("dragonfruit");
                    foods.add("white peaches");
                    break;
                default:
                    break;
            }
        }
        else if (type.equals("veggies")) {
            switch (color) {
                case "red":
                    foods.add("radish");
                    foods.add("red cabbage");
                    foods.add("red onion");
                    foods.add("red pepper");
                    foods.add("tomato");
                    break;
                case "orange":
                    foods.add("carrot");
                    foods.add("orange pepper");
                    foods.add("pumpkin");
                    foods.add("squash");
                    foods.add("sweet potatoes");
                    break;
                case "yellow":
                    foods.add("corn");
                    foods.add("rutabaga");
                    foods.add("summer squash");
                    foods.add("yellow peppers");
                    foods.add("yellow potato");
                    break;
                case "green":
                    foods.add("broccoli");
                    foods.add("celery");
                    foods.add("green beans");
                    foods.add("lettuce");
                    foods.add("spinach");
                    break;
                case "blue/purple":
                    foods.add("beets");
                    foods.add("eggplant");
                    foods.add("purple cabbage");
                    foods.add("purple carrots");
                    foods.add("purple potatoes");
                    break;
                case "white":
                    foods.add("cauliflower");
                    foods.add("garlic");
                    foods.add("onion");
                    foods.add("parsnips");
                    foods.add("potatoes");
                    break;
                default:
                    break;
            }

        }
        return foods;
    }
}