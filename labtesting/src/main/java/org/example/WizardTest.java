
package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WizardTest {

    private Wizard wizard;

    @BeforeEach
    void setUp() {
        SpellLibrary dummyLibrary = () -> "Ice Shard";   // Simple dummy for predictable testing
        wizard = new Wizard(80, 12, 3, "Lightning", dummyLibrary);
    }

    @Test
    void constructor_shouldInitializeWizardPropertiesCorrectly() {
        assertEquals(80, wizard.getHealth());
        assertEquals(12, wizard.getStrength());
        assertEquals(3, wizard.getLives());
        assertEquals("Lightning", wizard.getSpell(), "Initial spell not set correctly");
    }

    @Test
    void convertToElf_shouldCreateWeakerButFasterElfFromWizard() {
        Elf elf = wizard.convertToElf();

        assertEquals(80, elf.getHealth(), "Health should be preserved");
        assertEquals(6, elf.getStrength(), "Wizard strength should be halved");
        assertEquals(3, elf.getLives(), "Lives should be preserved");
        assertEquals(8, elf.getSpeed(), "Wizard-to-elf conversion should set speed to 8");
    }

    @Test
    void castRandomSpell_shouldReturnFormattedStringUsingLibrary() {
        String result = wizard.castRandomspell();
        assertEquals("Casting Ice Shard", result,
                "castRandomSpell should prepend 'Casting ' to the spell name");
    }

    @Test
    void setSpell_shouldUpdateCurrentSpellName() {
        wizard.setSpell("Meteor Strike");
        assertEquals("Meteor Strike", wizard.getSpell());
    }
}
