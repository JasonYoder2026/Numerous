package edu.bsu.cs;

public class IntegerToRomanNumeral {

    public String convertToRomanNumeral(int num) {
        int[] values = {1000, 500, 100, 50, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "D", "C", "L", "X", "IX", "V", "IV", "I"};

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
