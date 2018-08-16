package de.pandigo.games.first.helper.impl;

import de.pandigo.games.first.entities.Player;
import de.pandigo.games.first.helper.ExperienceHelper;
import org.springframework.stereotype.Service;

@Service
public class ExperienceHelperImpl implements ExperienceHelper {

    @Override
    public void addExperience(Player player, int expAmount) {
        player.setExp(player.getExp() + expAmount);
    }
}
