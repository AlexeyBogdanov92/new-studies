package day11.task2.model;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    static final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    int health = 100;
    int physAttack;
    double physDef;
    double magicDef;

    @Override
    public void physAttack(Hero h) {
        double attackScore = physAttack * (1 - h.physDef);
        if (h.health - attackScore < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;
        }
    }
}
