package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {

    /**Номер месяца

     Временные промежутки «год» и «месяц», принятые на Терре, используются и на других планетах
     и объектах Федерации, в том числе — на корабле JRush. Однако зачастую стажёры экипажа
     внеземного происхождения путаются, когда речь заходит о земных месяцах. Поможем им: напишем
     программу с коллекциями, которая по имени месяца выведет его номер на экран.
     *
     * Номер месяца
     Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
     Используйте коллекции.


     Требования:
     1. Программа должна считывать одно значение с клавиатуры.
     2. Программа должна выводить текст на экран.
     3. Класс Solution должен содержать один метод.
     4. Программа должна использовать коллекции.
     5. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по
     заданному шаблону.*/
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String[] monthes = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        HashMap<String,Integer> map = new HashMap();

        for (int i = 0; i < monthes.length; i++) {

            map.put(monthes[i],i+1);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthInput = reader.readLine().trim();

        if (map.containsKey(monthInput)) {

            System.out.println(monthInput + " is " + map.get(monthInput) + " month");
        } else {
            System.out.println("wrong input");
        }
    }
}
