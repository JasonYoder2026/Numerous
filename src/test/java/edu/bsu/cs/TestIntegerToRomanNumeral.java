package edu.bsu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntegerToRomanNumeral {
    IntegerToRomanNumeral convert = new IntegerToRomanNumeral();

    @Test
    public void testConvert1() {
        assertEquals("I", convert.convertToRomanNumeral(1));
    }

    @Test
    public void testConvert5() {
        assertEquals("V", convert.convertToRomanNumeral(5));
    }

    @Test
    public void testConvert10() {
        assertEquals("X", convert.convertToRomanNumeral(10));
    }

    @Test
    public void testSubtract1() {
        assertEquals("IV", convert.convertToRomanNumeral(4));
    }
}
