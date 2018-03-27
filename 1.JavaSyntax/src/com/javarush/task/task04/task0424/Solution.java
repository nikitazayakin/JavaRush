package com.javarush.task.task04.task0424;

/* 
Три числа
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /**Три числа
     Ввод с клавиатуры, сравнение чисел и вывод на экран — у студентов 4 уровня секретного
     центра JavaRush эти навыки оттачиваются до автоматизма.
     Давайте напишем программу, в которой пользователь вводит три числа с клавиатуры. Затем
     происходит сравнение, и если мы находим число, которое отличается от двух других, выводим
     на экран его порядковый номер.


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна использовать команды System.out.println() или System.out.print().
     3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
     4. Если все числа разные, ничего не выводить.*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numArray = new int[3];

        for (int i = 0; i < numArray.length; i++) {

            numArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        if (numArray[1] != numArray[2] && numArray[2] == numArray[0]) {
            System.out.println(2);
        }
        if (numArray[2] != numArray[0] && numArray[1] == numArray[0]) {
            System.out.println(3);
        }
        if (numArray[0] != numArray[2] && numArray[2] == numArray[1]) {
            System.out.println(1);
        }
    }
}
