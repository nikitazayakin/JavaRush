package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {

    /**Задача по алгоритмам
     Написать программу, которая:
     1. вводит с консоли число N, которое должно быть больше 0
     2. потом вводит N чисел с консоли
     3. выводит на экран максимальное из введенных N чисел.


     Требования:
     1. Программа должна считывать числа с клавиатуры.
     2. В классе должен быть метод public static void main.
     3. Нельзя добавлять новые методы в класс Solution.
     4. Программа должна выводить на экран максимальное из введенных N чисел.*/
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int numCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numCount; i++) {
            maximum = Math.max(maximum,Integer.parseInt(reader.readLine()));
        }

        System.out.println(maximum);
    }
}
