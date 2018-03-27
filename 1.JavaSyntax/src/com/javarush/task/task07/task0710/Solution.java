package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
В начало списка
*/

public class Solution {

    /**В начало списка

     Представьте, что люди записываются на консультацию, скажем, к дантисту, но очередь работает не
     как очередь, а как стек: последним записался, первым получил сверлом в зуб. Составим программу
     по мотивам этой неестественной ситуации: создадим список, и добавим в него 10 строк, но
     добавлять будем не в конец списка, а в начало.

     В начало списка
     1. Создай список строк в методе main.
     2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
     3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.


     Требования:
     1. Объяви переменную типа список строк и сразу проинициализируй ee.
     2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
     3. Программа должна добавлять строки в начало списка.
     4. Программа должна выводить список на экран, каждое значение с новой строки.*/
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        getStringListInputReversed(strings);

        int min = strings.get(0).length();
        for (String s: strings) {
            if (min > s.length()) {
                min = s.length();
            }
        }

        for (String s: strings) {
            System.out.println(s);
        }
    }

    public static void getStringListInputReversed(List<String> strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(0,reader.readLine());
        }
    }
}
