package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

import java.util.Arrays;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < 10; i++) {
            MULTIPLICATION_TABLE[0][i] = i + 1;
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] =MULTIPLICATION_TABLE[0][j] * (i + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }

        int[] x1 = {1, 2, 3};
        int[] x2 = {1, 2, 3};
        System.out.println(Arrays.equals(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    }
}
