package com.javarush.task.task04.task0422;

/* 
18+
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    /** 18+
     Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».


     Требования:
     1. Программа должна считывать строки c клавиатуры.
     2. Программа должна использовать команду System.out.println() или System.out.print().
     3. Если возраст меньше 18 вывести сообщение "Подрасти еще".
     4. Если возраст больше либо равно 18 ничего не выводить.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());

        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
