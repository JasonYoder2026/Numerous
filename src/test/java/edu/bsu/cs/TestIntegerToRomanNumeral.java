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
    public void testConvert50() {
        assertEquals("L", convert.convertToRomanNumeral(50));
    }

    @Test
    public void testConvert100() {
        assertEquals("C", convert.convertToRomanNumeral(100));
    }

    @Test
    public void testConvert500() {
        assertEquals("D", convert.convertToRomanNumeral(500));
    }

    @Test
    public void testConvert1000() {
        assertEquals("M", convert.convertToRomanNumeral(1000));
    }

    @Test
    public void testSubtract1() {
        assertEquals("IV", convert.convertToRomanNumeral(4));
    }

    @Test
    public void testSubtractFrom10() {
        assertEquals("IX", convert.convertToRomanNumeral(9));
    }

    @Test
    public void testSubtractFrom50() {
        assertEquals("XL", convert.convertToRomanNumeral(40));
    }

    @Test
    public void testSubtractFrom100() {
        assertEquals("XC", convert.convertToRomanNumeral(90));
    }

    @Test
    public void testSubtractFrom500() {
        assertEquals("CD", convert.convertToRomanNumeral(400));
    }

    @Test
    public void testSubtractFrom1000() {
        assertEquals("CM", convert.convertToRomanNumeral(900));
    }
}
