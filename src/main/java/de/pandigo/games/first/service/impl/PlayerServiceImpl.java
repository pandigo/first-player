package de.pandigo.games.first.service.impl;

import de.pandigo.games.first.entity.Player;
import de.pandigo.games.first.helper.ExperienceHelper;
import de.pandigo.games.first.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final List<Player> playerList = new ArrayList<>();

    @Autowired
    private ExperienceHelper experienceHelper;

    @Override
    public Player createPlayer() {
        Player player = new Player(this.playerList.size() + 1);
        this.playerList.add(player);
        return player;
    }

    @Override
    public Player getPlayer(long playerId) {
        return this.playerList.get((int) playerId - 1);
    }

    @Override
    public Player addExpToPlayer(long playerId, int expAmount) {
        Player player = this.getPlayer(playerId);
        this.experienceHelper.addExperience(player, expAmount);
        return player;
    }
}
