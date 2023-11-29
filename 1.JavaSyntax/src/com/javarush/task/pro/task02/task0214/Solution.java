package com.javarush.task.pro.task02.task0214;

import java.util.Locale;
import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String s1 = console.nextLine();
        String s2 = console.nextLine();
        String s3 = console.nextLine();
        System.out.println(s3);
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase());
    }
}
