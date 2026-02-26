
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;
    @BeforeEach
    void setUp() {
        player = new Player(100, 20, 3) {
        };
    }

    @Test
    void constructor_shouldSetPropertiesCorrectly() {
        assertEquals(100, player.getHealth(), "Health should be initialized correctly");
        assertEquals(20, player.getStrength(), "Strength should be initialized correctly");
        assertEquals(3, player.getLives(), "Lives should be initialized correctly");
    }

    @Test
    void decrementLive_shouldReduceLivesAndRestoreHealth_whenLivesRemain() {
        player.setHealth(30);
        int initialLives = player.getLives();

        player.decrementLive();

        assertEquals(initialLives - 1, player.getLives(), "Lives should decrease by 1");
        assertEquals(100, player.getHealth(), "Health should be restored to max after losing a life");
    }

    @Test
    void decrementLive_shouldPrintMessageAndNotRestoreHealth_whenNoLivesLeft() {
        player.setLives(1);
        player.setHealth(40);

        player.decrementLive();

        assertEquals(0, player.getLives(), "Lives should reach zero");
        assertEquals(40, player.getHealth(), "Health should NOT be restored when no lives left");
    }

    @Test
    void attack_shouldReduceTargetHealthByAttackersStrength() {
        Player target = new Player(80, 15, 2) {};
        int initialTargetHealth = target.getHealth();

        player.attack(target);

        assertEquals(initialTargetHealth - 20, target.getHealth(),
                "Target health should decrease by attacker's strength");
    }

    @Test
    void checkHealth_shouldCallDecrementLive_whenHealthIsZeroOrNegative() {
        player.setHealth(0);
        int livesBefore = player.getLives();
        player.checHealth();
        assertEquals(livesBefore - 1, player.getLives(),
                "Lives should decrease when health <= 0");
        assertEquals(100, player.getHealth(),
                "Health should be restored after losing a life");
    }

    @Test
    void checkHealth_shouldDoNothing_whenHealthIsStillPositive() {
        player.setHealth(50);
        int livesBefore = player.getLives();
        int healthBefore = player.getHealth();
        player.checHealth();

        assertEquals(livesBefore, player.getLives(), "Lives should not change");
        assertEquals(healthBefore, player.getHealth(), "Health should not change");
    }
}
