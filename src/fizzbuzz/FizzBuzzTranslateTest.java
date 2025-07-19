package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FizzBuzzTranslateTest {
    @Test
    void testFizzBuzzBasic() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(3));
        assertEquals("Buzz", FizzBuzzTranslate.translate(5));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
        assertEquals("hai", FizzBuzzTranslate.translate(2));
    }

    @Test
    void testFizzBuzzByContainDigits() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(13));
        assertEquals("Buzz", FizzBuzzTranslate.translate(52));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(53));
    }

    @Test
    void testNumberToVietnamese() {
        assertEquals("hai sáu", FizzBuzzTranslate.translate(26));
        assertEquals("chín tám", FizzBuzzTranslate.translate(98));
        assertEquals("một một", FizzBuzzTranslate.translate(11));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzTranslate.translate(0));
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzTranslate.translate(100));
    }
}
