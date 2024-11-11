package edu.bsu.cs;

public class IntegerToRomanNumeral {

    public String convertToRomanNumeral(int num) {
        if (num == 1) {
            return "I";
        }
        if (num == 5) {
            return "V";
        }
        if (num == 10) {
            return "X";
        }
        return "";
    }
}
