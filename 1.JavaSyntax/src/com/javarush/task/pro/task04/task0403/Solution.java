package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNext()) {
            String output = scanner.nextLine();

            if (!output.equals("ENTER"))
                sum = sum + Integer.parseInt(output);
            else
                break;
        }

        System.out.println(sum);
    }
}