package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Продолжаем мыть раму
*/

public class Solution {

    /**Продолжаем мыть раму

     С этого момента мамино мытье рамы омрачено списками. Или наоборот, улучшено? Решаем такую
     задачку: вносим знаменитые слова из «Букваря» в список: «мама», «мыла», «раму». После каждого
     слова вставляем в список строку, содержащую слово «именно». И выводим результат на экран.
     Каждый элемент списка — с новой строки.
     *
     * Продолжаем мыть раму
     1. Создай список из слов «мама», «мыла», «раму».
     2. После каждого слова вставь в список строку, содержащую слово «именно».
     3. Вывести результат на экран, каждый элемент списка с новой строки.


     Требования:
     1. Программа не должна считывать данные с клавиатуры.
     2. Объяви переменную типа список строк и сразу проинициализируй ee.
     3. Добавь в список слова: «мама», «мыла», «раму».
     4. После каждого слова добавь в список строку, содержащую слово «именно».
     5. Выведи элементы списка на экран, каждый с новой строки.*/
    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<>();

        Collections.addAll(strings,"мама", "мыла", "раму");

        for (int i = 1; i <= 5; i += 2) {

            strings.add(i,"именно");
        }

        printList(strings);
    }

    public static void printList(List<String> list) {

        for (int i = 0 ; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
