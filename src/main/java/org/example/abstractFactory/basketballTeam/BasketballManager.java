package org.example.abstractFactory.basketballTeam;

import org.example.abstractFactory.Manager;

public class BasketballManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Basketball manager manage basketball team");
    }
}
