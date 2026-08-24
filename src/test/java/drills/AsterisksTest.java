package drills;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AsterisksTest {

    private final Asterisks drill = new Asterisks();

    @Test
    @DisplayName("five asterisks")
    void fiveAsterisks() {
        assertEquals("*****", drill.asterisks(5));
    }

    @Test
    @DisplayName("ten asterisks")
    void tenAsterisks() {
        assertEquals("**********", drill.asterisks(10));
    }

    @Test
    @DisplayName("forty asterisks")
    void fortyAsterisks() {
        assertEquals("*".repeat(40), drill.asterisks(40));
    }

    @Test
    @DisplayName("zero asterisks is the empty string, not null")
    void zeroAsterisks() {
        assertEquals("", drill.asterisks(0));
    }
}
