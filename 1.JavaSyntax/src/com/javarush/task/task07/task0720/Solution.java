package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Перестановочка подоспела
*/

public class Solution {

    /**Перестановочка подоспела

     Игры со списками — лучшее времяпрепровождение! Реклама так себе получается? Пожалуй, лучшая
     реклама средства языка программирования — его частое применение. Рекламируем списки, решая
     задачу: задаем числа m и n, печатаем n строк и заполняем ими список. После этого совершаем
     незатейливую манипуляцию: переставляем m первых строк в конец списка
     *
     * Перестановочка подоспела
     Ввести с клавиатуры 2 числа N и M.
     Ввести N строк и заполнить ими список.
     Переставить M первых строк в конец списка.
     Вывести список на экран, каждое значение с новой строки.

     Примечание: запрещено создавать больше одного списка.


     Требования:
     1. Объяви переменную типа список строк и сразу проинициализируй ee.
     2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
     3. Переставить M первых строк в конец списка.
     4. Выведи список на экран, каждое значение с новой строки.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int stringQuantity = Integer.parseInt(reader.readLine());
        int strToMoveQuantity = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();
        getStringListInput(strings,stringQuantity);

        for (int i = 0; i < strToMoveQuantity; i++) {
            strings.add(strings.get(0));
            strings.remove(0);
        }

        printList(strings);
    }

    public static void getStringListInput(List<String> strings, int quantity) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < quantity; i++) {
            strings.add(reader.readLine());
        }
    }

    public static void printList(List list) {

        for (int i = 0 ; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
