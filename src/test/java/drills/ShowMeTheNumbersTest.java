package drills;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShowMeTheNumbersTest {

    private final ShowMeTheNumbers drill = new ShowMeTheNumbers();

    @Test
    @DisplayName("one through five, each on its own line")
    void oneThroughFive() {
        assertEquals("1\n2\n3\n4\n5\n", drill.count(5));
    }

    @Test
    @DisplayName("one through ten, each on its own line")
    void oneThroughTen() {
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n", drill.count(10));
    }

    @Test
    @DisplayName("one on its own is still followed by a newline")
    void justOne() {
        assertEquals("1\n", drill.count(1));
    }

    @Test
    @DisplayName("zero numbers is the empty string, not null")
    void zeroNumbers() {
        assertEquals("", drill.count(0));
    }
}
