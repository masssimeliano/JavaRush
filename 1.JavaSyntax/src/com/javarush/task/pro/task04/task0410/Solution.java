package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (true) {
            if (scanner.hasNext() && !scanner.hasNextInt()) {
                break;
            } else {
                int value = scanner.nextInt();
                if (value < min) {
                    min2 = min;
                    min = value;
                } else {
                    if (value < min2 && value != min) {
                        min2 = value;
                    }
                }
            }
        }

        System.out.println(min2);

    }
}