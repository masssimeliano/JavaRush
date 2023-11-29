package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        while (true) {
            if (scanner.hasNext() && !scanner.hasNextInt()) {
                break;
            } else {
                int value = scanner.nextInt();
                min = min > value ? value : min;
            }
        }

        System.out.println(min);

    }
}