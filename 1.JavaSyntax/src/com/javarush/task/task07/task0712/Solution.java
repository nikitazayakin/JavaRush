package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {

    /** Самые-самые

     Игры со списками в Java очень популярны. А всё потому, что это просто и интересно.
     Присоединяйтесь! В этой задачке создаем список строк. Затем — добавляем в него 10 строчек
     с клавиатуры. Самое интересное — определяем, какая строка в списке встретится раньше: самая
     короткая или самая длинная. Если таких строк несколько, учитываем самые первые из них.
     *
     Самые-самые
     1. Создай список строк.
     2. Добавь в него 10 строчек с клавиатуры.
     3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
     Если таких строк несколько, то должны быть учтены самые первые из них.
     4. Выведи на экран строку из п.3.


     Требования:
     1. Объяви переменную типа список строк и сразу проинициализируй ee.
     2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
     3. Программа должна выводить на экран самую короткую строку, если она была раньше самой
     длинной.
     4. Программа должна выводить на экран самую длинную строку, если она была раньше самой
     короткой.*/
    public static void main(String[] args) throws Exception {


        ArrayList<String> strings = new ArrayList<>();

        getStringListInput(strings);

        int max = strings.get(0).length();
        int maxIndex = 0;
        int min = strings.get(0).length();
        int minIndex = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
                maxIndex = i;
            }
            if (min > strings.get(i).length()) {
                min = strings.get(i).length();
                minIndex = i;
            }
        }

        if (minIndex < maxIndex) {
            System.out.println(strings.get(minIndex));
        }
        if (maxIndex < minIndex) {
            System.out.println(strings.get(maxIndex));
        }
    }

    public static void getStringListInput(List<String> strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
    }
}
