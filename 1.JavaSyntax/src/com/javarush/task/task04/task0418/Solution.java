package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /** Минимум двух чисел
     Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
     Если два числа равны между собой, необходимо вывести любое.


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна выводить число на экран.
     3. Программа должна выводить на экран минимальное из двух чисел.
     4. Если два числа равны между собой, необходимо вывести любое.
     */
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(min(Integer.parseInt(bufferedReader.readLine()),
                Integer.parseInt(bufferedReader.readLine())));
    }

    /**
     * Returns the smaller of two {@code int} values. That is,
     * the result the argument closer to the value of
     * {@link Integer#MIN_VALUE}.  If the arguments have the same
     * value, the result is that same value.
     *
     * @param   num1   an argument.
     * @param   num2   another argument.
     * @return  the smaller of {@code a} and {@code b}.
     */
    public static int min(int num1, int num2) {

        return (num1 <= num2) ? num1 : num2;
    }
}