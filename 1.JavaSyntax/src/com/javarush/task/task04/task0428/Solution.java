package com.javarush.task.task04.task0428;

/* 
Положительное число
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /**Положительное число
     Ввести с клавиатуры три целых числа. Вывести на экран количество
     положительных чисел в исходном наборе.

     Пример для чисел -4 6 6:
     2

     Пример для чисел -6 -6 -3:
     0


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна выводить число на экран.
     3. Программа должна выводить количество положительных чисел в
     исходном наборе.
     4. Если положительных чисел нет, программа должна вывести "0".*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numArray = new int[3];

        for (int i = 0; i < numArray.length ; i++) {

            numArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int positiveNumbers = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > 0) {
                positiveNumbers++;
            }
        }

        System.out.println(positiveNumbers);
    }
}
