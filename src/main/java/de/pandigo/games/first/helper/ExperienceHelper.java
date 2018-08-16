package de.pandigo.games.first.helper;

import de.pandigo.games.first.entities.Player;

/**
 * Helper for making operations easier in relation ship to experience and levels.
 */
public interface ExperienceHelper {

    /**
     * Add a given amount of experience to a player. If the player has enough experience the level of the player is increased.
     *
     * @param player    The player who is lucky and get more experience
     * @param expAmount The amount of experience
     */
    void addExperience(Player player, int expAmount);
}
