package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    /** Максимум четырех чисел
     Ввести с клавиатуры четыре числа, и вывести максимальное из них.
     Если числа равны между собой, необходимо вывести любое.


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна выводить число на экран.
     3. Программа должна выводить на экран максимальное из четырёх чисел.
     4. Если числа равны между собой, необходимо вывести любое.*/
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] numArray = new int[4];

        for (int i = 0; i < numArray.length; i++) {

            numArray[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int maximum = getMaxFromArray(numArray);
        System.out.println(maximum);
    }

    /** Returns max number of array as the result.
     *
     * @param numArray array of {@code int}
     * @return maximum {@code int}
     */
    public static int getMaxFromArray(int[] numArray) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < numArray.length; i++) {

            maximum = Math.max(maximum,numArray[i]);
        }
        return maximum;
    }
}
