package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {

    /**Модернизация ПО

     Вы, вероятно, видели, как обновляеются приложения. Это происходит, если в их код внесли
     изменения. В секретном центре JavaRush вам выдали код, который нужно изменить (добавить новую
     функциональность). Сейчас программа определяет, какая семья живёт в доме с указанным номером,
     а после вашего вмешательства она должна выдавать город проживания семьи.
     *
     * Модернизация ПО
     Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
     Новая задача: Программа должна работать не с номерами домов, а с городами:

     Пример ввода:
     Москва
     Ивановы
     Киев
     Петровы
     Лондон
     Абрамовичи

     Лондон

     Пример вывода:
     Абрамовичи


     Требования:
     1. Программа должна выводить текст на экран.
     2. Программа должна считывать значения с клавиатуры.
     3. Класс Solution должен содержать один метод.
     4. Программа должна вывести фамилию семьи по введенному городу.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String,String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;

            String lastname = reader.readLine();

            addresses.put(city,lastname);
        }

        //read home number
        String city = reader.readLine();

        if (addresses.containsKey(city)) {
            String familySecondName = addresses.get(city);
            System.out.println(familySecondName);
        }
    }
}
