package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

// import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    /**Количество дней в году
     Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в
     следующем виде:
     «количество дней в году: x», где
     х — 366 для високосного года,
     х — 365 для обычного года.

     Подсказка:
     В високосном году — 366 дней, тогда как в обычном — 365.
     Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны
     400.
     Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
     Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
     Годы 2100, 2200 и 2300 — не високосные.


     Требования:
     1. Программа должна считывать число c клавиатуры.
     2. Программа должна выводить текст на экран.
     3. Если введенный год является високосным, необходимо вывести текст: "количество дней в
     году: 366"
     4. Если введенный год не является високосным, необходимо вывести текст: "количество дней
     в году: 365"*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine());

        isLeapYear(year);
    }

    /** Checks if year is the Leap-Year or not.
     *
     * @param year year to check (int)
     */
    public static void isLeapYear(int year) {
        if ((year % 4 != 0) || ((year % 400 != 0) && (year % 100 == 0))) {
            System.out.println("количество дней в году: 365");
        } else {
            System.out.println("количество дней в году: 366");
        }
    }

}