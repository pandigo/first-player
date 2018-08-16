package de.pandigo.games.first.controller;

import de.pandigo.games.first.config.CustomMediaType;
import de.pandigo.games.first.entities.Experience;
import de.pandigo.games.first.entities.Player;
import de.pandigo.games.first.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/player")
public class PlayerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.POST)
    public Player createPlayer() {
        LOGGER.trace("Called createPlayer");
        return this.playerService.createPlayer();
    }

    @RequestMapping(value = "/{playerId}", method = RequestMethod.POST, consumes = CustomMediaType.APPLICATION_ADD_EXP_JSON)
    public Player addExpToPlayer(@PathVariable(value = "playerId") long playerId, @RequestBody() Experience experience) {
        LOGGER.trace("Called addExpToPlayer playerId: {} amount of experience: {} exp", playerId, experience.getAmount());
        return this.playerService.addExpToPlayer(playerId, experience.getAmount());
    }

    @RequestMapping(value = "/{playerId}", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable(value = "playerId") long playerId) {
        LOGGER.trace("Called getPlayer {}", playerId);
        return this.playerService.getPlayer(playerId);
    }
}
