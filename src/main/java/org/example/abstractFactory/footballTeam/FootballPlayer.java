package org.example.abstractFactory.footballTeam;

import org.example.abstractFactory.Player;

public class FootballPlayer implements Player {

    @Override
    public void play() {
        System.out.println("Football player plays football");
    }
}
