package org.example.builder.pizza;

import org.example.builder.ingridients.cheese.Cheese;
import org.example.builder.ingridients.protein.Protein;
import org.example.builder.ingridients.vegetable.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private int price;
    private int calories;
    private Size size;
    private List<Cheese> cheeses = new ArrayList<>();
    private List<Protein> proteins = new ArrayList<>();
    private List<Vegetable> vegetables = new ArrayList<>();

    public Pizza() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
        price += cheese.getPrice();
        calories += cheese.getCalories();
    }

    public void addProtein(Protein protein) {
        proteins.add(protein);
        price += protein.getPrice();
        calories += protein.getPrice();

    }

    public void addVegetable(Vegetable vegetable) {
        vegetables.add(vegetable);
        price += vegetable.getPrice();
        calories += vegetable.getCalories();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCalories() {
        int sizeCoefficient;
        switch (size) {
            case SMALL -> sizeCoefficient = 6;
            case MEDIUM -> sizeCoefficient = 8;
            case BIG -> sizeCoefficient = 10;
            default -> sizeCoefficient = 0;
        }
        return calories * sizeCoefficient;
    }

    public Size getSize() {
        return size;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public List<Protein> getProteins() {
        return proteins;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }
}
