package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            System.out.print('Б');
            while (j <= 18) {
                if (i != 1 && i != 10) {
                    System.out.print(' ');
                } else {
                    System.out.print('Б');
                }
                j++;
            }
            System.out.print('Б');
            System.out.println();
            i++;
        }

    }
}