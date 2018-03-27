package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /**Среднее арифметическое
     Вводить с клавиатуры числа и вычислить среднее арифметическое.
     Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить
     программу.
     -1 не должно учитываться.

     Пример для чисел 1 2 2 4 5 -1:
     2.8

     Пример для чисел 4 3 2 1 -1:
     2.5


     Требования:
     1. Программа должна считывать данные с клавиатуры.
     2. Программа должна выводить данные на экран.
     3. После ввода -1 программа должна корректно завершить работу.
     4. Если ввести: 1 2 2 4 5 -1, программа должна вывести 2.8.
     5. Если ввести: -100 0 100 -1, программа должна вывести 0.0.
     6. Если ввести: 1 -1, программа должна вывести 1.0.
     7. Выведенный результат должен соответствовать заданию для любых входных данных.*/
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = 0;
        double numbersSum = 0;

        for (int number = Integer.parseInt(br.readLine()); number != -1; ) {

            numbersCount++;
            numbersSum += number;

            number = Integer.parseInt(br.readLine());
        }

        System.out.println(numbersCount == 0 ? 0 : numbersSum / numbersCount);
    }
}

