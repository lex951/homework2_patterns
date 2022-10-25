package org.example.builder;

import org.example.builder.ingridients.cheese.Cheese;
import org.example.builder.ingridients.protein.Protein;
import org.example.builder.ingridients.vegetable.Vegetable;
import org.example.builder.pizza.Pizza;
import org.example.builder.pizza.Size;

public interface PizzaBuilder {

    PizzaBuilder buildName();

    PizzaBuilder buildSize(Size size);

    PizzaBuilder buildCheeses();

    PizzaBuilder buildCheeses(Cheese cheese);

    PizzaBuilder buildProteins();

    PizzaBuilder buildProteins(Protein protein);

    PizzaBuilder buildVegetables();

    PizzaBuilder buildVegetables(Vegetable vegetable);

    Pizza buildPizza();
}
