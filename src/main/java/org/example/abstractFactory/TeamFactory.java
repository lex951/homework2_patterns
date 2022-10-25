package org.example.abstractFactory;

public interface TeamFactory {
    Coach getCoach();
    Player getPlayer();
    Manager getManager();
}
