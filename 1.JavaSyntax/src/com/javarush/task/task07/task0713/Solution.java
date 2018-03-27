package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {

    /**Играем в Jолушку

     Игра Jолушка 1.0: распихиваиние чисел по трем спискам. Правила таковы: Jолушка получила список
     из 20 чисел. Ей нужно проверить, какие из них нацело делятся на 3, какие на 2, а какие — ни на
     то, ни на другое. Затем ей нужно сохранить их в отдельные списки. Числа, которые делятся на 3
     и на 2 одновременно, например 6, попадают в оба списка. Решаем!
     *
     * Играем в Jолушку
     1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
     Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
     Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
     2. Метод printList должен выводить на экран все элементы списка с новой строки.
     3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
     потом тот, который для x%2, потом последний.


     Требования:
     1. Объяви и сразу проинициализируй 4 переменных типа ArrayList (список целых чисел). Первый
     список будет главным, а остальные - дополнительными.
     2. Считать 20 чисел с клавиатуры и добавить их в главный список.
     3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
     4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
     5. Добавить в третий дополнительный список все остальные числа из главного.
     6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой
     строки.
     7. Программа должна вывести три дополнительных списка, используя метод printList.*/
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integersMod3 = new ArrayList<>();
        ArrayList<Integer> integersMod2 = new ArrayList<>();
        ArrayList<Integer> integersModOthers = new ArrayList<>();

        getStringListInput(integers);

        for (int i :integers) {

            if (i % 3 == 0 || i % 2 == 0) {
                if (i % 3 == 0)
                    integersMod3.add(i);
                if (i % 2 == 0)
                    integersMod2.add(i);
            } else {
                integersModOthers.add(i);
            }


        }

        printList(integersMod3);
        printList(integersMod2);
        printList(integersModOthers);
    }

    public static void getStringListInput(List<Integer> strings) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            strings.add(Integer.valueOf(reader.readLine()));
        }
    }

    public static void printList(List<Integer> list) {

        for (int s: list) {
            System.out.println(s);
        }
    }
}
