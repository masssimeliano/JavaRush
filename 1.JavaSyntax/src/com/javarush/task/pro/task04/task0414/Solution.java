package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number = scanner.nextInt();
        number = number >= 5 ? 0 : number;

        int i = 1;
        do {
            System.out.println(line);
            i++;
        } while (i <= number);

    }
}