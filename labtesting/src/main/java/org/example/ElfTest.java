package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

public class ElfTest {
    private Elf elf;
    @BeforeEach
    void setUp() {
        elf = new Elf(90, 18, 3, 12);
    }
    @Test
    void constructor_shouldSetAllElfPropertiesCorrectly() {
        assertEquals(90, elf.getHealth());
        assertEquals(18, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(12, elf.getSpeed(), "Speed should be initialized properly");
    }
    @Test
    void setSpeedSpeedValue() {
        elf.setSpeed(20);
        assertEquals(20, elf.getSpeed(), "Speed failed qaqaasim");
    }
    @Test
    void speedProperty_shouldAcceptzeroandbelow() {
        elf.setSpeed(0);
        assertEquals(0, elf.getSpeed());
        elf.setSpeed(-3);
        assertEquals(-3, elf.getSpeed(), "Negative speed  must be allowed");
    }
}
