package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

// import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /** Скромность украшает программиста
     Ввести с клавиатуры имя и вывести надпись:
     name зарабатывает $5,000. Ха-ха-ха!

     Пример:
     Тимур зарабатывает $5,000. Ха-ха-ха!


     Требования:
     1. Программа должна выводить текст.
     2. Программа должна считывать данные с клавиатуры.
     3. Выведенный текст должен содержать введенное имя.
     4. Выведенный тест должен полностью соответствовать заданию.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String strName = bufferedReader.readLine();

        System.out.println(strName + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
