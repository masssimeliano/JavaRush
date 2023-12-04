package com.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0)
            return 0;

        int octalNumber = 0;
        int k = 0;

        while (decimalNumber != 0) {
            int x = decimalNumber % 8;
            octalNumber += x * Math.pow(10, k);
            k++;

            decimalNumber = decimalNumber / 8;
        }

        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0)
            return 0;

        int decimalNumber = 0;
        int k = 0;

        while (octalNumber != 0) {
            int x = octalNumber % 10;
            decimalNumber += x * Math.pow(8, k);
            k++;

            octalNumber = octalNumber / 10;
        }

        return decimalNumber;
    }
}
