package com.dzmudziak;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public List<String> getMeals() {
        return meals;
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        } else System.out.println("This meal is already on the menu!");
    }

    public void printMeals() {
        if (!meals.isEmpty()) {
            meals.forEach(System.out::println);
        }else System.out.println("The menu is empty");
    }

    public void clearMenu() {
        this.meals.clear();
    }
}
