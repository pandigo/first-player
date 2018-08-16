package de.pandigo.games.first.service;

import de.pandigo.games.first.entities.Player;

/**
 * The PlayerService, all method in which it is necessary save the player object after performing the operation.
 */
public interface PlayerService {

    /**
     * Create a new player.
     *
     * @return the newly created player object
     */
    Player createPlayer();

    /**
     * Provides the player object for the given player id.
     *
     * @param playerId The player id
     * @return The player object
     */
    Player getPlayer(long playerId);

    /**
     * Method to add experience to the player, if the player has enough experience to level up this method will
     * increase the level of the player as well.
     *
     * @param playerId  The player which should get more experience
     * @param expAmount The amount of exp the player should get
     * @return The updated player object
     */
    Player addExpToPlayer(long playerId, int expAmount);
}
