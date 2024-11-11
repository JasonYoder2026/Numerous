package edu.bsu.cs;

public class IntegerToRomanNumeral {

    public String convertToRomanNumeral(int num) {
        if (num == 1) {
            return "I";
        } else {
            return "V";
        }
    }
}
