package org.example;

public class Wizard extends Player {

    private String spell;
    private final SpellLibrary spellLibrary;

    public Wizard(int health, int strength, int lives, String spell, SpellLibrary spellLibrary) {
        super(health, strength, lives);
        this.spell = spell;
        this.spellLibrary = spellLibrary;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
    public Elf convertToElf() {
        Elf elf = new Elf(health, strength, lives, 8);
        elf.setHealth(health);
        elf.setStrength(strength / 2); // lose some power
        return elf;
    }

    public String castRandomspell() {
        String randomSpell = spellLibrary.getRandomSpell();
        return "Casting " + randomSpell;
    }
}
