package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Проверка на упорядоченность
*/
public class Solution {

    /**Проверка на упорядоченность

     Иерархия — первый страж порядка и боевое оружие диктатуры. О диктатуре подумаем поже, а пока
     составим список из 10 слов. Введём их с клавиатуры. Наша задача состоит в том, чтобы проверить,
     является ли список упорядоченным по возрастанию длины строки. Если нет, выводим на экран номер
     первого элемента, нарушающего такую упорядоченность.
     *
     * Проверка на упорядоченность
     1. Введи с клавиатуры 10 слов в список строк.
     2. Определить, является ли список упорядоченным по возрастанию длины строки.
     3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую
     упорядоченность.


     Требования:
     1. Объяви переменную типа список строк и сразу проинициализируй ee.
     2. Считай 10 строк с клавиатуры и добавь их в список.
     3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
     4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран номер
     первого элемента, нарушающего такую упорядоченность.*/
    public static void main(String[] args) throws IOException {

        ArrayList<String> strings = new ArrayList<>();

        getStringListInput(strings,10);

        int lastLength;
        if (strings.size() > 0) {
            lastLength = strings.get(0).length();
        } else {
            return;
        }

        for (int i = 1; i < strings.size(); i++) {

            if (lastLength <= strings.get(i).length()) {
                lastLength = strings.get(i).length();
            } else {
                System.out.println(i);
                return;
            }
        }
    }

    public static void getStringListInput(List<String> strings, int quantity) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < quantity; i++) {
            strings.add(reader.readLine());
        }
    }
}

