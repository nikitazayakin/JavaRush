package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
        //напишите тут ваш код
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }

        Date start = new Date();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        Date middle = new Date();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        Date end = new Date();

        if (middle.getTime() - start.getTime() < end.getTime() - middle.getTime()) {
            return arrayList;
        } else {
            return linkedList;
        }

    }

    public static List getListForSet() {
        //напишите тут ваш код
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }

        Date start = new Date();
        for (int i = 0; i < 10000; i++) {
            arrayList.set(i,i);
        }
        Date middle = new Date();
        for (int i = 0; i < 10000; i++) {
            linkedList.set(i,i);
        }
        Date end = new Date();

        if (middle.getTime() - start.getTime() < end.getTime() - middle.getTime()) {
            return arrayList;
        } else {
            return linkedList;
        }
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код

        List arrayList = new ArrayList();
        List linkedList = new LinkedList();

        Date start = new Date();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, i);
        }
        Date middle = new Date();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, i);
        }
        Date end = new Date();

        if (middle.getTime() - start.getTime() < end.getTime() - middle.getTime()) {
            return arrayList;
        } else {
            return linkedList;
        }
    }

    public static List getListForRemove() {
        //напишите тут ваш код

        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }

        Date start = new Date();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
        Date middle = new Date();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        Date end = new Date();

        if (middle.getTime() - start.getTime() < end.getTime() - middle.getTime()) {
            return arrayList;
        } else {
            return linkedList;
        }
    }

    /**Квартет «Методы»

     В этой задаче мы работаем со списками LinkedList и ArrayList, и вот каким образом. Нам нужно
     реализовать 4 метода. Каждый из них должен возвращать список, который лучше всего подходит для
     выполнения данных операций (быстрее всего справится с большим количеством операций). А вот
     измерять ничего не нужно.

     Квартет «Методы»
     Реализовать 4 метода.
     Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных
     операций (быстрее всего справится с большим количеством операций).
     Ничего измерять не нужно.


     Требования:
     1. Программа не должна выводить текст на экран.
     2. Класс Solution должен содержать только 5 методов.
     3. Метод getListForGet должен возвращать список, который лучше всего подходит для операции
     взятия элемента.
     4. Метод getListForSet должен возвращать список, который лучше всего подходит для установки
     значения элемента.
     5. Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для
     операций добавления или вставки элемента.
     6. Метод getListForRemove должен возвращать список, который лучше всего подходит для операции
     удаления элемента.*/
    public static void main(String[] args) {

    }
}
