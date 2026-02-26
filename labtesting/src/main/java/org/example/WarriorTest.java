
package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WarriorTest {

    private Warrior warrior;

    @BeforeEach
    void setUp() {
        warrior = new Warrior(120, 25, 4, 18);
    }

    @Test
    void constructor_shouldInitializeAllWarriorSpecificAndInheritedFields() {
        assertEquals(120, warrior.getHealth(), "Health initialization failed");
        assertEquals(25, warrior.getStrength(), "Strength initialization failed");
        assertEquals(4, warrior.getLives(), "Lives initialization failed");
        assertEquals(18, warrior.getForce(), "Force should be set correctly");
    }
    @Test
    void convertToElf_shouldCreateElfWithPreservedHealthAndStrength() {
        Elf elf = warrior.convertToElf();
        assertEquals(120, elf.getHealth(), "Elf should inherit warrior's current health");
        assertEquals(25, elf.getStrength(), "Elf should inherit warrior's strength");
        assertEquals(4, elf.getLives(), "Elf should inherit lives");
        assertEquals(5, elf.getSpeed(), "Elf should have default speed of 5");
    }

    @Test
    void setForce_shouldCorrectlyUpdateForceProperty() {
        warrior.setForce(35);
        assertEquals(35, warrior.getForce(), "Force setter did not update value");
    }
}
