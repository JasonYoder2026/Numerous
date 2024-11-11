package edu.bsu.cs;

public class IntegerToRomanNumeral {

    public String convertToRomanNumeral(int num) {
        int[] values = {10, 5, 4, 1};
        String[] numerals = {"X", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                romanNumeral.append(numerals[i]);
            }
        }
        return romanNumeral.toString();
    }
}
