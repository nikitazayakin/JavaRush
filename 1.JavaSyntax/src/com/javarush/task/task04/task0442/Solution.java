package com.javarush.task.task04.task0442;


/* 
Суммирование
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /**Суммирование
     Вводить с клавиатуры числа и считать их сумму.
     Если пользователь ввел -1, вывести на экран сумму и завершить программу.
     -1 должно учитываться в сумме.


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна выводить число на экран.
     3. Программа должна посчитать сумму введенных чисел. Если пользователь
     ввел -1, вывести на экран сумму и завершить программу.
     4. В программе должен использоваться цикл for или цикл while.*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberSum = 0;

        for (int inputNumber = Integer.parseInt(bufferedReader.readLine()); ; inputNumber = Integer.parseInt(bufferedReader.readLine())) {

            numberSum += inputNumber;

            if (inputNumber == -1) {
                break;
            }
        }

        System.out.println(numberSum);
    }
}
