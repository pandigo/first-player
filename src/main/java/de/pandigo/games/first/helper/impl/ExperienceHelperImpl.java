package de.pandigo.games.first.helper.impl;

import de.pandigo.games.first.entity.Player;
import de.pandigo.games.first.helper.ExperienceHelper;
import org.springframework.stereotype.Service;

@Service
public class ExperienceHelperImpl implements ExperienceHelper {

    @Override
    public void addExperience(Player player, int expAmount) {
        int newExpAmount = player.getExp()+expAmount;
        if (newExpAmount >= 1000 && newExpAmount < 3000) {
            player.setLevel(1);
        } else if (newExpAmount >= 3000 ) {
            player.setLevel(2);
        }
        player.setExp(newExpAmount);
    }
}
