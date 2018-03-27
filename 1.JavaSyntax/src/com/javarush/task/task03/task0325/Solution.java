package com.javarush.task.task03.task0325;

//import java.io.*;

/* 
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**Финансовые ожидания
 Ввести с клавиатуры число n.
 Вывести на экран надпись «Я буду зарабатывать $n в час».

 Пример:
 Я буду зарабатывать $50 в час


 Требования:
 1. Программа должна выводить текст.
 2. Программа должна считывать данные с клавиатуры.
 3. Выведенный текст должен содержать введенное число n.
 4. Выведенный тест должен полностью соответствовать заданию.*/
public class Solution {
    /** Exercise entry point method. Programs waits for one integer input,
     * and then outputs one line.
     *
     * @param args not used.
     * @throws Exception i/o exceptions aren't handled by class.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int salary = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Я буду зарабатывать $" + salary + " в час");
    }
}
