package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    /**Вывести на экран сегодняшнюю дату
     Вывести на экран текущую дату в аналогичном виде «21 02 2014«.


     Требования:
     1. Дата должна содержать день, месяц и год, разделенные пробелом.
     2. День должен соответствовать текущему.
     3. Месяц должен соответствовать текущему.
     4. Год должен соответствовать текущему.
     5. Вся дата должна быть выведена в одной строке.*/
    public static void main(String[] args) {

        TimeZone timeZone = SimpleTimeZone.getDefault();
        Calendar calendar = new GregorianCalendar();
        Date dateNow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);

        System.out.println(dateFormat.format(dateNow));
    }
}
