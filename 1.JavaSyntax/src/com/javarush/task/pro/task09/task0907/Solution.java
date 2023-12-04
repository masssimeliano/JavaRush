package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0)
            return "";

        String hexNumber = "";

        while (decimalNumber != 0) {
            int x = decimalNumber % 16;
            hexNumber = HEX.charAt(x) + hexNumber;

            decimalNumber = decimalNumber / 16;
        }

        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty())
            return 0;

        int decimalNumber = 0;

        for (int i = 0; i < hexNumber.length(); i++) {
            int pos = HEX.indexOf(hexNumber.charAt(hexNumber.length() - i - 1));
            decimalNumber += pos * Math.pow(16, i);
        }

        return decimalNumber;
    }
}