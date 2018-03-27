package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /** Предсказание на будущее
     Ввести с клавиатуры отдельно Имя, число1, число2.
     Вывести надпись:
     «Имя» получает «число1» через «число2» лет.

     Пример:
     Коля получает 3000 через 5 лет.


     Требования:
     1. Программа должна выводить текст.
     2. Программа должна считывать данные с клавиатуры.
     3. Выведенный текст должен содержать введенное имя.
     4. Выведенный текст должен содержать введенное число1.
     5. Выведенный текст должен содержать введенное число2.
     6. Выведенный тест должен полностью соответствовать заданию.
     */
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String strSalary = bufferedReader.readLine();
        String strPeriod = bufferedReader.readLine();
        //int intPeriod = Integer.parseInt(strPeriod);

        System.out.println(name + " получает " + strSalary + " через " + strPeriod + " лет.");
    }
}
