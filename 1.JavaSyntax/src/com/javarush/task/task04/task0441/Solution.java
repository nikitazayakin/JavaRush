package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    /**Как-то средненько
     Ввести с клавиатуры три числа, вывести на экран среднее из них.
     Т.е. не самое большое и не самое маленькое.
     Если все числа равны, вивести любое из них.


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна выводить число на экран.
     3. Программа должна выводить среднее из трех чисел.
     4. Если все числа равны, вывести любое из них.
     5. Если два числа из трех равны, вывести любое из двух.*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numArray = new int[3];

        for (int i = 0; i < numArray.length ; i++) {

            numArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int numberSum = 0;
        for (int i = 0; i < numArray.length; i++) {

            minNumber = Math.min(minNumber,numArray[i]);
            maxNumber = Math.max(maxNumber,numArray[i]);
            numberSum += numArray[i];
        }

        System.out.println(numberSum - minNumber - maxNumber);
    }
}
