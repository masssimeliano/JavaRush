package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int pos1 = path.indexOf("jdk");
        int pos2 = path.indexOf("/", pos1);

        path = path.substring(0, pos1) + jdk + path.substring(pos2, path.length());

        return path;
    }
}
