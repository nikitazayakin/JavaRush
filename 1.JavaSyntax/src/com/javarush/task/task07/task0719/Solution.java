package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Вывести числа в обратном порядке
*/

public class Solution {

    /**Вывести числа в обратном порядке

     Вы же знаете, что задачи можно решать разными способами? Да конечно знаете. Но в этой
     конкретной задаче мы попросим вас вспомнить о цикле for, и совершать манипуляции именно с его
     помощью. А сделать нужно вот что: ввести с клавиатуры 10 чисел, заполнить ими список, а затем
     — вывести их в обратном порядке.
     *
     * Вывести числа в обратном порядке
     Ввести с клавиатуры 10 чисел и заполнить ими список.
     Вывести их в обратном порядке.
     Использовать только цикл for.


     Требования:
     1. Объяви переменную типа список целых чисел и сразу проинициализируй ee.
     2. Считай 10 целых чисел с клавиатуры и добавь их в список.
     3. Выведи числа в обратном порядке.
     4. Используй цикл for.*/
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> integers = new ArrayList<>();
        getIntListInput(integers,10);

        for (int i = integers.size() - 1; i >= 0; i--) {
            System.out.println(integers.get(i));
        }


    }

    public static void getIntListInput(List<Integer> integers, int quantity) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < quantity; i++) {
            integers.add(Integer.valueOf(reader.readLine()));
        }
    }
}
