package org.example.abstractFactory.footballTeam;

import org.example.abstractFactory.Manager;

public class FootballManager implements Manager {
    @Override
    public void manage() {
        System.out.println("Football manager manage football team");
    }
}
