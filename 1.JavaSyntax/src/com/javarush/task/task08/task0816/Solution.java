package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stallone2", new Date("JULY 1 1980"));
        map.put("Stallone3", new Date("AUGUST 1 1980"));
        map.put("Stallone4", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone5", new Date("OCTOBER 1 1980"));
        map.put("Stallone6", new Date("MAY 1 1980"));
        map.put("Stallone7", new Date("NOVEMBER 12 1981"));
        map.put("Stallone8", new Date("AUGUST 31 1979"));
        map.put("Stallone9", new Date("JANUARY 1 1980"));
        map.put("Stallone0", new Date("APRIL 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {

            HashMap.Entry<String ,Date> entry = (HashMap.Entry<String ,Date>) iterator.next();
            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }
    }

    /**Добрая Зинаида и летние каникулы

     Зинаида Васильевна — классный руководитель 7-Б класса какой-то там террианской школы,
     подробности не важны. А важно то, что она дарит подарки ученикам в дни рождения. Везет не всем:
     летние именинники — в пролёте по причине каникул. Пишем программу для Зинаиды: создаем словарь
     с фамилиями и датами рождения, удаляем из него людей, родившихся летом.
     *
     * Добрая Зинаида и летние каникулы
     Создать словарь (Map<String, Date>) и занести в него десять записей по принципу:
     «фамилия» - «дата рождения».
     Удалить из словаря всех людей, родившихся летом.


     Требования:
     1. Программа не должна выводить текст на экран.
     2. Программа не должна считывать значения с клавиатуры.
     3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
     Date состоящий из 10 записей.
     4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.*/
    public static void main(String[] args) {

    }
}
