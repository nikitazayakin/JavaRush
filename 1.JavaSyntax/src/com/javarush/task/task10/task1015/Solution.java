package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {

    /**Массив списков строк

     Иногда задание — это просто задание. Без подвоха, и не стоит искать в нём сложности
     и глубины. Нужно просто сесть и решить. Перед нами — именно такое задание. Смотрите,
     как все внятно и просто: создайте массив, элементами которого будут списки строк.
     А потом заполните массив любыми данными и выведите их на экран.
     *
     * Массив списков строк
     Создать массив, элементами которого будут списки строк.
     Заполнить массив любыми данными и вывести их на экран.


     Требования:
     1. Метод createList должен объявлять и инициализировать массив с типом элементов
     ArrayList.
     2. Метод createList должен возвращать созданный массив.
     3. Метод createList должен добавлять в массив элементы (списки строк). Списки
     должны быть не пустые.
     4. Программа должна выводить данные на экран.
     5. Метод main должен вызывать метод createList.
     6. Метод main должен вызывать метод printList.*/
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[10];
        for (int i = 0; i < arrayLists.length; i++) {
            arrayLists[i] = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                arrayLists[i].add("string " + i + " " + j);
            }
        }

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}