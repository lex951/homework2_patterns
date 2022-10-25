package org.example.abstractFactory.footballTeam;

import org.example.abstractFactory.Coach;
import org.example.abstractFactory.Manager;
import org.example.abstractFactory.Player;
import org.example.abstractFactory.TeamFactory;

public class FootballTeamFactory implements TeamFactory {

    @Override
    public Coach getCoach() {
        return new FootballCoach();
    }

    @Override
    public Player getPlayer() {
        return new FootballPlayer();
    }

    @Override
    public Manager getManager() {
        return new FootballManager();
    }
}
