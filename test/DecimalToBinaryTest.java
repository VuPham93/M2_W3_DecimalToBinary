import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {
    @Test
    void testConvert1() {
        int number = 71;
        String expected = "1000111";

        String result = DecimalToBinary.convert(number);
        assertEquals(expected, result);
    }

    @Test
    void testConvert2() {
        int number = 0;
        String expected = "0";

        String result = DecimalToBinary.convert(number);
        assertEquals(expected, result);
    }

    @Test
    void testConvert3() {
        int number = 1;
        String expected = "1";

        String result = DecimalToBinary.convert(number);
        assertEquals(expected, result);
    }

    @Test
    void testConvert4() {
        int number = 30;
        String expected = "11110";

        String result = DecimalToBinary.convert(number);
        assertEquals(expected, result);
    }
}