package de.pandigo.games.first.helper.impl;

import de.pandigo.games.first.entities.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ExperienceHelperImplTest {

    @InjectMocks
    private ExperienceHelperImpl experienceHelper;

    @Test
    public void addExperience_playerAtLevelZero_add1000_playerLevel1() {
        Player player = new Player(1);
        player.setExp(1000);
        experienceHelper.addExperience(player, 1000);
        assertThat(player.getLevel(), is(1));
    }

    @Test
    public void addExperience_playerAtLevelZero_add3000_playerLevel2() {
        Player player = new Player(1);
        player.setExp(1000);
        experienceHelper.addExperience(player, 3000);
        assertThat(player.getLevel(), is(2));
    }

    @Test
    public void addExperience_playerAtLevelZero_add1000ThreeTimes_playerLevel2() {
        Player player = new Player(1);
        player.setExp(1000);
        experienceHelper.addExperience(player, 1000);
        experienceHelper.addExperience(player, 1000);
        experienceHelper.addExperience(player, 1000);
        assertThat(player.getLevel(), is(2));
    }
}