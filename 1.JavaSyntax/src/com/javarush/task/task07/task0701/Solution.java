package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {

    /**Массивный максимум

     На сегодняшнем соревновании приз за лучший результат получает Кентербери! Он автоматизировал 25
     процессов, все его 19 сокурсников оказались менее быстры. Давайте напишем программу, которая
     помогла бы определять победителя таких соревнований: составляем массив на 20 элементов,
     заполняем его числами и находим максимальное из них.

     Массивный максимум
     1. В методе initializeArray():
     1.1. Создайте массив на 20 чисел
     1.2. Считайте с консоли 20 чисел и заполните ими массив
     2. Метод max(int[] array) должен находить максимальное число из элементов массива


     Требования:
     1. Метод initializeArray должен создавать массив из 20 целых чисел.
     2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
     3. Метод max должен возвращать максимальный элемент из переданного массива.
     4. Метод main изменять нельзя.*/
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[20];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(reader.readLine());
        }
        return numArray;
    }

    public static int max(int[] array) {

        int maxNumber;

        if (array.length > 0)
            maxNumber = array[0];
        else maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > maxNumber)
                maxNumber = array[i];
        }

        return maxNumber;
    }
}
