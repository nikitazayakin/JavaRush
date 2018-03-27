package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    /**Какое сегодня число?

     В Java есть много инструментов, позволяющих работать со временем и датами.
     В этот раз будем пользоваться объектом Date и SimpleDateFormat, а задание
     у нас такое: пользователь должен ввести с клавиатуры дату в формате
     «08/18/2013», а приложение должно трансформировать введенное в форму
     «AUG 18, 2013».
     *
     * Какое сегодня число?
     Ввести с клавиатуры дату в формате «08/18/2013»
     Вывести на экран эту дату в виде «AUG 18, 2013».
     Воспользоваться объектом Date и SimpleDateFormat.


     Требования:
     1. Программа должна считывать данные с клавиатуры.
     2. В программе должна быть объявлена переменная типа SimpleDateFormat.
     3. В программе должна быть объявлена переменная типа Date.
     4. Все переменные должны быть проинициализированы.
     5. Программа должна выводить данные на экран.
     6. Вывод должен соответствовать заданию.*/
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        //format.applyPattern("MM/dd/YYYY");
        Date date = format.parse(reader.readLine());
        format.applyPattern("MMM dd, yyyy");
        System.out.println(format.format(date).toUpperCase());


        //format.format(date,System.out,null);
    }
}
