package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {

    /**Массив из строчек в обратном порядке

     Нет, мы не будем инвертировать каждую строку массива так, чтобы она вывелась на экран
     зеркально. Это условие другой задачи! А здесь и сейчас мы должны создать массив на 10 строк,
     ввести с клавиатуры 8 строк и сохранить их в массив, после чего вывести содержимое всего
     массива (10 элементов) на экран в обратном порядке.

     Массив из строчек в обратном порядке
     1. Создать массив на 10 строк.
     2. Ввести с клавиатуры 8 строк и сохранить их в массив.
     3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый
     элемент — с новой строки.


     Требования:
     1. Программа должна создавать массив на 10 строк.
     2. Программа должна считывать строки для массива с клавиатуры.
     3. Программа должна выводить 10 строк, каждую с новой строки.
     4. Все строки массива (10 элементов) должны быть выведены в обратном порядке.*/
    public static void main(String[] args) throws Exception {

        String[] strArray = getStringArrayInput();

        printStringArrayReversed(strArray);

    }

    public static void printStringArrayReversed(String[] strArray) {

        for (String s: strArray) {
            System.out.println(s);
        }
    }

    public static String[] getStringArrayInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = new String[10];

        for (int i = strArray.length-1; i >= 2; i--) {
            strArray[i] = reader.readLine();
        }

        return strArray;
    }
}