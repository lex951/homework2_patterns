package org.example.abstractFactory.basketballTeam;

import org.example.abstractFactory.Coach;

public class BasketballCoach implements Coach {
    @Override
    public void train() {
        System.out.println("Basketball coach trains basketball team");
    }
}
