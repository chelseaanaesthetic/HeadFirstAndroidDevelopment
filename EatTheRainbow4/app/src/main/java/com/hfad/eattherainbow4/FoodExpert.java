package com.hfad.eattherainbow4;

public class FoodExpert {

    String getFoods(String color, String type) {
        StringBuilder foods = new StringBuilder();

        if (type.equals("fruits")) {
            switch (color) {
                case "red":
                    foods.append("cherry \n");
                    foods.append("pomegranate \n");
                    foods.append("raspberry \n");
                    foods.append("strawberry \n");
                    foods.append("watermelon \n");
                    break;
                case "orange":
                    foods.append("apricots \n");
                    foods.append("cantaloupe \n");
                    foods.append("mango \n");
                    foods.append("oranges \n");
                    foods.append("persimmons \n");
                    break;
                case "yellow":
                    foods.append("lemon \n");
                    foods.append("pear \n");
                    foods.append("pineapple \n");
                    foods.append("yellow apples \n");
                    foods.append("yellow figs \n");
                    break;
                case "green":
                    foods.append("green apples \n");
                    foods.append("green grapes \n");
                    foods.append("honeydew melon \n");
                    foods.append("kiwi \n");
                    foods.append("lime \n");
                    break;
                case "blue/purple":
                    foods.append("blueberries \n");
                    foods.append("blackberries \n");
                    foods.append("black currants \n");
                    foods.append("grapes \n");
                    foods.append("plums \n");
                    break;
                case "white":
                    foods.append("banana \n");
                    foods.append("coconut \n");
                    foods.append("dates \n");
                    foods.append("dragonfruit \n");
                    foods.append("white peaches \n");
                    break;
                default:
                    break;
            }
        }
        else if (type.equals("veggies")) {
            switch (color) {
                case "red":
                    foods.append("radish \n");
                    foods.append("red cabbage \n");
                    foods.append("red onion \n");
                    foods.append("red pepper \n");
                    foods.append("tomato \n");
                    break;
                case "orange":
                    foods.append("carrot \n");
                    foods.append("orange pepper \n");
                    foods.append("pumpkin \n");
                    foods.append("squash \n");
                    foods.append("sweet potatoes \n");
                    break;
                case "yellow":
                    foods.append("corn \n");
                    foods.append("rutabaga \n");
                    foods.append("summer squash \n");
                    foods.append("yellow peppers \n");
                    foods.append("yellow potato \n");
                    break;
                case "green":
                    foods.append("broccoli \n");
                    foods.append("celery \n");
                    foods.append("green beans \n");
                    foods.append("lettuce \n");
                    foods.append("spinach \n");
                    break;
                case "blue/purple":
                    foods.append("beets \n");
                    foods.append("eggplant \n");
                    foods.append("purple cabbage \n");
                    foods.append("purple carrots \n");
                    foods.append("purple potatoes \n");
                    break;
                case "white":
                    foods.append("cauliflower \n");
                    foods.append("garlic \n");
                    foods.append("onion \n");
                    foods.append("parsnips \n");
                    foods.append("potatoes \n");
                    break;
                default:
                    break;
            }

        }
        return foods.toString();
    }
}