package org.example;

import org.example.Player;
import org.example.Elf;
public class Warrior extends Player {

    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    /**
     * Converts this Warrior into an Elf (copying most properties).
     *
     * @return new Elf instance
     */
    public Elf convertToElf() {
        Elf elf = new Elf(health, strength, lives, 5);
        elf.setHealth(health);
        elf.setStrength(strength);
        return elf;
    }
}