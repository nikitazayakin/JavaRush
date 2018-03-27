package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вставок
*/

public class Solution {

    /**Время для 10 тысяч вставок

     Время — наш самый ценный ресурс. На всех планетах, за исключением Тральфамадора, над ним власти
     нет. Поэтому на Тральфамадоре нет программистов, а на Терре — их полно, потому что они помогают
     другим экономить свое время. Давайте измерим, сколько времени занимает 10 тысяч вставок для
     списков LinkedList и ArrayList и восхвалим автоматизацию.

     Время для 10 тысяч вставок
     Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
     Метод getTimeMsOfInsert должен вернуть время своего исполнения в миллисекундах.


     Требования:
     1. Программа должна выводить числа на экран.
     2. Метод main должен вызывать метод getTimeMsOfInsert только два раза.
     3. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
     4. Метод getTimeMsOfInsert должен вызывать метод insert10000 только один раз.
     5. Метод getTimeMsOfInsert должен вернуть время в миллисекундах, которое занимает 10 тысяч
     вставок в список.*/
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        //напишите тут ваш код
        Date startDate = new Date();

        insert10000(list);

        //напишите тут ваш код
        Date stopDate = new Date();

        return stopDate.getTime() - startDate.getTime();
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
