package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {

    /**Числа по возрастанию

     Возможно, вы уже слышали об упорядоченных изоморфах с планеты Линейный Хаос — изобретателях
     всех методов сортировки. Сегодня нужно решить задачу от них: пользователь вводит с клавиатуры
     5 чисел, метод сортирует числа по возрастанию, а другой метод — выводит их на экран. Осилите?
     Если да, возможно, вам следует посетить Линейный Хаос!

     Числа по возрастанию
     Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем
     порядке.

     Пример ввода:
     3
     2
     15
     6
     17

     Пример вывода:
     2
     3
     6
     15
     17


     Требования:
     1. Программа должна считывать 5 чисел с клавиатуры.
     2. Программа должна выводить 5 чисел, каждое с новой строки.
     3. Выведенные числа должны быть отсортированы по возрастанию.
     4. Вывод должен содержать те же числа, что и были введены (порядок не важен).*/
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[5];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(reader.readLine());
        }

        sortArray(numArray);

        printArray(numArray);

    }

    private static void printArray(int[] numArray) {

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }

    /**this is bubble sort algorithm below. sorts ascending.*/
    private static void sortArray(int[] numArray) {
        //sort(numArray); //ready algorithm from java.util library.

        for (int i = numArray.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numArray[j] > numArray[j+1]) {
                    int tmp = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = tmp;
                }
            }
        }
    }
}
