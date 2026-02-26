package org.example;

public abstract class Player {
    protected int health;
    protected final int maxHealth;
    protected int strength;
    protected int lives;
    protected Player(int health, int strength, int lives) {
        if (health <= 0 || strength < 0 || lives <= 0) {
            throw new IllegalArgumentException("Invalid initial values");
        }
        this.health = health;
        this.maxHealth = health;
        this.strength = strength;
        this.lives = lives;
    }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getLives() { return lives; }
    public void setLives(int lives) { this.lives = lives; }
    public void decrementLive() {
        lives--;
        if (lives > 0) {
            health = maxHealth;
        } else {
            System.out.println("This character is dead");
        }
    }
    public void attack(Player playerToAttack) {
        if (playerToAttack == null) return;
        playerToAttack.health -= this.strength;
        playerToAttack.checHealth();
    }
    public void checHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }
}

