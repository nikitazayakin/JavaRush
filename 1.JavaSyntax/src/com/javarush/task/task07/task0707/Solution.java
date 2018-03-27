package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {

    /**Что за список такой?

     Java-программисты любят свои списки не меньше, чем сознательные домохозяйки списки продуктов и
     дел. Если вы еще не полюбили их, пора начинать. А любовь программиста начинается с кода. Итак,
     в этой задаче создае список строк, добавляем 5 разных строк и выводим размер списка на экран.
     Затем выводим содержимое списка на экран. Всё просто!

     Что за список такой?
     1. Создай список строк.
     2. Добавь в него 5 различных строк.
     3. Выведи его размер на экран.
     4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


     Требования:
     1. Программа не должна ничего считывать с клавиатуры.
     2. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
     3. Программа должна добавить 5 любых строк в список с помощью метода add().
     4. Программа должна вывести размер списка на экран.
     5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.*/
    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<>();

        getStringListInput(strings);

        System.out.println(strings.size());

        for (String s: strings) {
            System.out.println(s);
        }
    }

    public static void getStringListInput(ArrayList<String> strings) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add("String" + i);
        }
    }
}
