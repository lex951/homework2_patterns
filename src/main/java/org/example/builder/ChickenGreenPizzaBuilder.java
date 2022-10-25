package org.example.builder;

import org.example.builder.ingridients.cheese.Cheese;
import org.example.builder.ingridients.cheese.Mozzarella;
import org.example.builder.ingridients.protein.Chicken;
import org.example.builder.ingridients.protein.Protein;
import org.example.builder.ingridients.vegetable.Pepper;
import org.example.builder.ingridients.vegetable.Tomato;
import org.example.builder.ingridients.vegetable.Vegetable;
import org.example.builder.pizza.Pizza;
import org.example.builder.pizza.Size;

public class ChickenGreenPizzaBuilder implements PizzaBuilder{

    Pizza pizza=new Pizza();

    @Override
    public PizzaBuilder buildName() {
        pizza.setName("Chicken Green");
        return this;
    }

    @Override
    public PizzaBuilder buildSize(Size size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder buildCheeses() {
        pizza.addCheese(new Mozzarella());
        return this;
    }

    @Override
    public PizzaBuilder buildCheeses(Cheese cheese) {
        pizza.addCheese(cheese);
        return this;
    }

    @Override
    public PizzaBuilder buildProteins() {
        pizza.addProtein(new Chicken());
        return this;
    }

    @Override
    public PizzaBuilder buildProteins(Protein protein) {
        pizza.addProtein(protein);
        return this;
    }

    public PizzaBuilder buildVegetables(){
        pizza.addVegetable(new Pepper());
        pizza.addVegetable(new Tomato());
        return this;
    }
    @Override
    public PizzaBuilder buildVegetables(Vegetable vegetable) {
        pizza.addVegetable(vegetable);
        return this;
    }

    @Override
    public Pizza buildPizza() {
        return pizza;
    }
}
