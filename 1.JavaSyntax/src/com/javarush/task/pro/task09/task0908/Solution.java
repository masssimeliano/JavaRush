package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        } else {
            for (char c : binaryNumber.toCharArray()) {
                if (c != '0' && c != '1') {
                    return "";
                }
            }

            if (binaryNumber.length() % 4 != 0) {
                for (int i = 0; i < binaryNumber.length() % 4; i++)
                    binaryNumber = "0" + binaryNumber;
            }

            String HEX = "0123456789abcdef";
            String hexNumber = "";
            for (int i = 0; i < binaryNumber.length(); i += 4) {
                String str = binaryNumber.substring(i, i + 4);

                int num = 0;
                for (int j = 0; j < str.length(); j++) {
                    int a = 0;
                    if (str.substring(j, j + 1).charAt(0) == '1')
                        a = 1;

                    num += a * Math.pow(2, str.length() - j - 1);
                }

                hexNumber = hexNumber + HEX.charAt(num);
            }

            return hexNumber;
        }
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        } else {
            String HEX = "0123456789abcdef";
            for (char c : hexNumber.toCharArray()) {
                if (HEX.indexOf(c) == -1) {
                    return "";
                }
            }

            String binaryNumber = "";
            for (int i = 0; i < hexNumber.length(); i++) {
                switch (HEX.indexOf(hexNumber.charAt(i))) {
                    case 0:
                        binaryNumber = binaryNumber + "0000";
                        break;
                    case 1:
                        binaryNumber = binaryNumber + "0001";
                        break;
                    case 2:
                        binaryNumber = binaryNumber + "0010";
                        break;
                    case 3:
                        binaryNumber = binaryNumber + "0011";
                        break;
                    case 4:
                        binaryNumber = binaryNumber + "0100";
                        break;
                    case 5:
                        binaryNumber = binaryNumber + "0101";
                        break;
                    case 6:
                        binaryNumber = binaryNumber + "0110";
                        break;
                    case 7:
                        binaryNumber = binaryNumber + "0111";
                        break;
                    case 8:
                        binaryNumber = binaryNumber + "1000";
                        break;
                    case 9:
                        binaryNumber = binaryNumber + "1001";
                        break;
                    case 10:
                        binaryNumber = binaryNumber + "1010";
                        break;
                    case 11:
                        binaryNumber = binaryNumber + "1011";
                        break;
                    case 12:
                        binaryNumber = binaryNumber + "1100";
                        break;
                    case 13:
                        binaryNumber = binaryNumber + "1101";
                        break;
                    case 14:
                        binaryNumber = binaryNumber + "1110";
                        break;
                    case 15:
                        binaryNumber = binaryNumber + "1111";
                        break;
                }
            }

            return binaryNumber;
        }
    }
}