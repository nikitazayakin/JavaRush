package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {

    /**Работа с датой

     Станция Небула-1 принимает звездолёты только по нечётным дням стандартного земного года (когда
     количество дней с начала года — нечётно). Выясним, можем ли мы сегодня отдохнуть на Небуле-2.
     Для этого реализуем метод isDateOdd(String date), возвращающий true, если количество дней с
     начала года — нечётное число, иначе false.
     *
     * Работа с датой
     1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество
     дней с начала года - нечетное число, иначе false
     2. String date передается в формате MAY 1 2013
     Не забудьте учесть первый день года.

     Пример:
     JANUARY 1 2000 = true
     JANUARY 2 2020 = false


     Требования:
     1. Программа должна выводить текст на экран.
     2. Класс Solution должен содержать два метода.
     3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное
     число, иначе false.
     4. Метод main() должен вызывать метод isDateOdd().*/
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date dateVar = new Date(date);
        Date dateYearStartTime = new Date(date);
        dateYearStartTime.setDate(1);
        dateYearStartTime.setHours(0);
        dateYearStartTime.setMinutes(0);
        dateYearStartTime.setSeconds(0);
        dateYearStartTime.setMonth(0);

        long msTimeDistance = dateVar.getTime() - dateYearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int nthDayOfYear = (int)(msTimeDistance / msDay + 1);
        if (nthDayOfYear % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
