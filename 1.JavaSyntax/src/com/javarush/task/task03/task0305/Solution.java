package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getFormattedDate(13, 12 ,1983)); // here we should get smth like MAY 1 2012
    }

    /**
     * Returns the <code>String</code> object and initializes it so that
     * it represents the date specified by the <code>year</code>,
     * <code>month</code> and <code>date</code>
     *
     * @param   year    the year.
     * @param   month   the month between 0-11.
     * @param   day    the day of the month between 1-31.
     * https://javarush.ru/quests/lectures/questsyntax.level03.lecture04
     * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
     * https://docs.oracle.com/javase/7/docs/api/java/text/DateFormat.html
     * https://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html
     */
    public static String getFormattedDate(int day, int month, int year) {

        DateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);

        /* next variation over next line of code is also possible
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,--month,day);
        */
        Calendar calendar = new GregorianCalendar(year,--month,day);
        Date birthday = calendar.getTime();

        return dateFormat.format(birthday).toUpperCase();
    }
}
