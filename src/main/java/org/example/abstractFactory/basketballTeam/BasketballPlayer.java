package org.example.abstractFactory.basketballTeam;

import org.example.abstractFactory.Player;

public class BasketballPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Basketball player plays basketball");
    }
}
