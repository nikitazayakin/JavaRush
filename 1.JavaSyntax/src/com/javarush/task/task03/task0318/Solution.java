package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

//import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /** Ввести с клавиатуры число и имя, вывести на экран строку:
     «имя» захватит мир через «число» лет. Му-ха-ха!

     Пример:
     Вася захватит мир через 8 лет. Му-ха-ха!

     Последовательность вводимых данных имеет большое значение.


     Требования:
     1. Программа должна выводить текст.
     2. Программа должна считывать данные с клавиатуры.
     3. Выведенный текст должен содержать введенное имя.
     4. Выведенный текст должен содержать введенное число.
     5. Выведенный тест должен полностью соответствовать заданию.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String strPeriod = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        //int nPeriod = Integer.parseInt(sPeriod);

        System.out.println(name + " захватит мир через " + strPeriod + " лет. Му-ха-ха!");
    }
}
