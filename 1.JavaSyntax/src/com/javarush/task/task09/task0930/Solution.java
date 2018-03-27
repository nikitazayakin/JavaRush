package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Задача по алгоритмам
*/

public class Solution {

    /**Задача по алгоритмам

     Вместо кубиков жители планеты Линейный Хаос дают своим детям решать задачки на сортировку.
     Вот вам одна из забавок маленьких упорядоченных изоморфиков, развлекитесь, как следует:
     после того, как пользователь введет с клавиатуры список слов (и чисел), программа должна
     вывести слова в возрастающем порядке, а числа — в убывающем.
     *
     * Задача по алгоритмам
     Задача: Пользователь вводит с клавиатуры список слов (и чисел).
     Слова вывести в возрастающем порядке, числа - в убывающем.

     Пример ввода:
     Вишня
     1
     Боб
     3
     Яблоко
     22
     0
     Арбуз

     Пример вывода:
     Арбуз
     22
     Боб
     3
     Вишня
     1
     0
     Яблоко


     Требования:
     1. Программа должна считывать данные с клавиатуры.
     2. Программа должна выводить данные на экран.
     3. Выведенные слова должны быть упорядочены по возрастанию.
     4. Выведенные числа должны быть упорядочены по убыванию.
     5. Метод main должен использовать метод sort.
     6. Метод sort должен использовать метод isGreaterThan.
     7. Метод sort должен использовать метод isNumber.*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    /** Complex sorting of strings bubble sort ascending and numbers bubble sort descending
     *
     * @param array mixed array of strings and numbers
     */
    public static void sort(String[] array) {
        //напишите тут ваш код

        //sorting strings first
        ///extracting strings from mixed array
        ArrayList<String> strings = new ArrayList<>();
        for (String str: array) {
            if (!isNumber(str)) {
                strings.add(str);
            }
        }

        ///sorting extracted strings ascending
        for (int i = strings.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if ( isGreaterThan(strings.get(j), strings.get(j + 1)) ) {
                    String tmp = strings.get(j);
                    strings.set(j, strings.get(j + 1));
                    strings.set(j + 1, tmp);
                }
            }
        }

        ///putting strings back into array
        Iterator<String > iterator = strings.iterator();
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) {
                array[i] = iterator.next() ;
            }
        }

        //sorting ints then
        ///extracting ints from mixed array
        ArrayList<Integer> integers = new ArrayList<>();
        for (String str: array) {
            if (isNumber(str)) {
                integers.add(Integer.parseInt(str));
            }
        }

        ///sorting extracted ints descending
        for (int i = integers.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (integers.get(j) < integers.get(j+1)) {
                    int tmp = integers.get(j);
                    integers.set(j, integers.get(j+1));
                    integers.set(j+1, tmp);
                }
            }
        }

        ///putting ints back into array
        Iterator<Integer > intsIterator = integers.iterator();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = intsIterator.next().toString();
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
