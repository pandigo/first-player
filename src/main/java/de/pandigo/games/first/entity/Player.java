package de.pandigo.games.first.entity;

import de.pandigo.games.first.domain.entity.GameObject;

public class Player extends GameObject {

    private int level;
    private int exp;

    public Player(long playerId) {
        this.id = playerId;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
