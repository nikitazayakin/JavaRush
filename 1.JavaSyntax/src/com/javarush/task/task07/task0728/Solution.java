package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {

    /**В убывающем порядке

     Упорядоченые изоморфы с планеты Линейный Хаос любят сортировать и принимают в свои ряды тех,
     кто хорошо умеет это делать. Вы можете возразить, что не собираетесь иметь с ними дело. Не
     получится: изоморфы часто проводят собеседования в ИТ-компании. Не игнорируем: пишем
     программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
     *
     * В убывающем порядке
     Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем
     порядке.


     Требования:
     1. Программа должна считывать 20 целых чисел с клавиатуры.
     2. Программа должна выводить 20 чисел.
     3. Метод main должен вызывать метод sort.
     4. Метод sort должен сортировать переданный массив по убыванию.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    /**bubble sort algorithm; descending sort*/
    public static void sort(int[] array) {

        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
