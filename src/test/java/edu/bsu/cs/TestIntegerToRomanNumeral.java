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

    @Test
    public void testConvert3() {
        assertEquals("III", convert.convertToRomanNumeral(3));
    }

    @Test
    public void testConvert1300() {
        assertEquals("MCCC", convert.convertToRomanNumeral(1300));
    }

    @Test
    public void testConvert673() {
        assertEquals("DCLXXIII", convert.convertToRomanNumeral(673));
    }

    @Test
    public void testConvert953() {
        assertEquals("CMLIII", convert.convertToRomanNumeral(953));
    }

    @Test
    public void testConvert85() {
        assertEquals("LXXXV", convert.convertToRomanNumeral(85));
    }
}
