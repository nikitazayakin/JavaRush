package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**Сортировка трех чисел
     Ввести с клавиатуры три числа, и вывести их в порядке убывания.
     Выведенные числа должны быть разделены пробелом.


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна выводить числа на экран.
     3. Выведенные числа должны быть разделены пробелом.
     4. Программа должна выводить числа в порядке убывания.*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numArray = new int[3];

        for (int i = 0; i < numArray.length; i++) {

            numArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(numArray);

        for (int i = numArray.length-1; i >= 0; i--) {
            System.out.print(numArray[i] + " ");
        }

    }
}
