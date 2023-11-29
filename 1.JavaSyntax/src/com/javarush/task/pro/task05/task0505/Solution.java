package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            if (n % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
