package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {

    /**Минимаксы в массивах

     В жилмассиве Трещина — всего 20 домов, но их номера проставляются от фонаря. Получается, конец
     и начало Трещины формируются случайным образом. Потому как так интереснее и непредсказуемее!
     Пишем мини-эмулятор Трещины: определим его начало и конец. Для этого запихнем жилмассив в
     массив, заполним его номерами домов, и найдем среди них наибольший и наименьший.
     *
     * Минимаксы в массивах
     Создать массив на 20 чисел.
     Заполнить его числами с клавиатуры.
     Найти максимальное и минимальное числа в массиве.
     Вывести на экран максимальное и минимальное числа через пробел.


     Требования:
     1. Создай массив целых чисел (int[]) на 20 элементов.
     2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
     3. Найди и выведи через пробел максимальное и минимальное числа.
     4. Используй цикл for.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];

        for (int i = 0; i < 20; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < ints.length; i++) {
            if (maximum < ints[i]) {
                maximum = ints[i];
            }
            if (minimum > ints[i]) {
                minimum = ints[i];
            }
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
