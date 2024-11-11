package edu.bsu.cs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntegerToRomanNumeral {
    IntegerToRomanNumeral convert = new IntegerToRomanNumeral();

    @Test
    public void testConverting1() {
        assertEquals("I", convert.convertToRomanNumeral(1));
    }
}
