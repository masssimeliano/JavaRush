package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (true) {
            if (scanner.hasNext() && !scanner.hasNextInt()) {
                break;
            } else {
                int value = scanner.nextInt();
                if (value % 2 == 0)
                    max = max < value ? value : max;
            }
        }

        System.out.println(max);

    }
}