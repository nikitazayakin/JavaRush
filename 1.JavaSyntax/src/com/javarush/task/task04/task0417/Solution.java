package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /**Существует ли пара?
     Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы
     одна пара равных между собой чисел.
     Если такая пара существует, вывести на экран числа через пробел.
     Если все три числа равны между собой, то вывести все три.

     Пример для чисел 1 2 2:
     2 2

     Пример для чисел 2 2 2:
     2 2 2


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна содержать System.out.println() или System.out.print()
     3. Если два числа равны между собой, необходимо вывести числа на экран.
     4. Если все три числа равны между собой, необходимо вывести все три.
     5. Если нет равных чисел, ничего не выводить.*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numArray = new int[3];

        for (int i = 0; i < numArray.length ; i++) {

            numArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        if (numArray[0] == numArray[1] && numArray[1] == numArray[2]) {
            System.out.println(numArray[0] + " " + numArray[0] + " " + numArray[0]);
        } else if (numArray[0] == numArray[1] || numArray[1] == numArray [2]) {
            System.out.println(numArray[1] + " " + numArray[1]);
        } else if (numArray[0] == numArray[2]) {
            System.out.println(numArray[0] + " " + numArray[0]);
        }
    }
}