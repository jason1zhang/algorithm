/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "kayak"})
    void isPalindromeTest(String input) {
        assertTrue(StringRecursion.isPalindrome(input));
    }

    @Test
    void DecimalToBinaryTest() {
        assertEquals("110", OtherRecursion.DecimalToBinary(6, ""));
    }
}
