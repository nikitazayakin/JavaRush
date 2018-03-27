package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Удваиваем слова
*/

public class Solution {

    /**Удваиваем слова

     Пишем программу-эхо. Она удваивает всё, что слышит. Вернее всё, что попало в список из 10
     строк. Для этого в программе-эхо создаем, собственно список из 10 слов (вводим с клавиатуры
     строки и заносим их в список) и метод doubleValues, который, собственно, удваивает слова по
     определенному принципу. Результат эхо выводим на экран. Ничего сложного.
     *
     * Удваиваем слова
     1. Введи с клавиатуры 10 слов в список строк.
     2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
     3. Выведи результат на экран, каждое значение с новой строки.


     Требования:
     1. Объяви переменную типа список строк и сразу проинициализируй ee.
     2. Считай 10 строк с клавиатуры и добавь их в список.
     3. Метод doubleValues должен удваивать элементы списка по принципу a,b,c -> a,a,b,b,c,c..
     4. Выведи получившийся список на экран, каждый элемент с новой строки.*/
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        getStringListInput(strings,10);

        ArrayList<String> result = doubleValues(strings);

        printList(result);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {
            list.add(i,list.get(i));
            i++;
        }
        return list;
    }

    public static void getStringListInput(List<String> strings,int quantity) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < quantity; i++) {
            strings.add(reader.readLine());
        }
    }

    public static void printList(List<String> list) {

        for (int i = 0 ; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
