package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    /**Совершенствуем функциональность
     Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из
     них на экран.
     Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.


     Требования:
     1. Программа должна считывать числа с клавиатуры.
     2. В классе должен быть метод public static void main.
     3. В классе должен быть метод public static min, принимающий 5 параметров типа int.
     4. Метод min должен возвращать минимум из 5 переданных чисел.
     5. Программа должна выводить строку, которая начинается на "Minimum = ".
     6. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных
     чисел.*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Minimum = " + min(arr[0],arr[1],arr[2],arr[3],arr[4]));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
    }
}
