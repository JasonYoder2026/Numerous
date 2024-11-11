package edu.bsu.cs;

public class IntegerToRomanNumeral {

    public String convertToRomanNumeral(int num) {
        int[] integerValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < integerValues.length; i++) {
            while (num >= integerValues[i]) {
                num -= integerValues[i];
                romanNumeral.append(romanNumerals[i]);
            }
        }
        return romanNumeral.toString();
    }
}
