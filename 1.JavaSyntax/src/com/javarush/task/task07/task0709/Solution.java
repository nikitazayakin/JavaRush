package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {

    /**Выражаемся покороче

     Краткость — сестра таланта. Давайте в следующей задаче восславим краткость и вот каким образом:
     создаем список, считываем 5 строк с клавиатуры и добавляем их в список, затем находим самую
     короткую строку и выводим её на экран. Если таких строк несколько — выводим их все, кардую с
     новой строки. Вопросы есть, рядовой!?

     Выражаемся покороче
     1. Создай список строк.
     2. Считай с клавиатуры 5 строк и добавь в список.
     3. Используя цикл, найди самую короткую строку в списке.
     4. Выведи найденную строку на экран.
     5. Если таких строк несколько, выведи каждую с новой строки.


     Требования:
     1. Объяви переменную типа список строк и сразу проинициализируй ee.
     2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
     3. Программа должна выводить самую короткую строку на экран.
     4. Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.*/
    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<>();

        getStringListInput(strings);

        int min = strings.get(0).length();
        for (String s: strings) {
            if (min > s.length()) {
                min = s.length();
            }
        }

        for (String s: strings) {
            if (s.length() == min)
                System.out.println(s);
        }
    }

    public static void getStringListInput(List<String> strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
    }
}
