package org.example.abstractFactory.footballTeam;

import org.example.abstractFactory.Coach;

public class FootballCoach implements Coach {
    @Override
    public void train() {
        System.out.println("Football coach trains football team");
    }
}
