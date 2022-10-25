package org.example.builder;

import org.example.builder.pizza.Pizza;
import org.example.builder.pizza.Size;

public class Director {
    PizzaBuilder builder;

    public Director(PizzaBuilder builder){
        this.builder=builder;
    }

    public void changeBuilder(PizzaBuilder builder){
        this.builder=builder;
    }

    public Pizza buildPizza(){
        return builder.buildName().buildSize(Size.MEDIUM).
                buildCheeses().buildProteins().buildVegetables().buildPizza();
    }

}

