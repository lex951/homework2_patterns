package org.example.abstractFactory.basketballTeam;

import org.example.abstractFactory.Coach;
import org.example.abstractFactory.Manager;
import org.example.abstractFactory.Player;
import org.example.abstractFactory.TeamFactory;

public class BasketballTeamFactory implements TeamFactory {
    @Override
    public Coach getCoach() {
        return new BasketballCoach();
    }

    @Override
    public Player getPlayer() {
        return new BasketballPlayer();
    }

    @Override
    public Manager getManager() {
        return new BasketballManager();
    }
}
