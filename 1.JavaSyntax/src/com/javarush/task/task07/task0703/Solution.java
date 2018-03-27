package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {

    /**Общение одиноких массивов

     Давайте создадим не один, а сразу два массива! В одном будет убежище для 10 чисел, в
     другом — для 10 строк. Заполним массив строк с клавиатуры, а в каждую ячейку массива чисел
     запишем длину строки из массива строк, индекс ячейки которой совпадает с текущим индексом из
     массива чисел. Затем выводим содержимое массива чисел на экран, и задача решена.

     Общение одиноких массивов
     1. Создать массив на 10 строк.
     2. Создать массив на 10 чисел.
     3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
     4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
     которой совпадает с текущим индексом из массива чисел.

     Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


     Требования:
     1. Программа должна создавать массив на 10 строк.
     2. Программа должна создавать массив на 10 целых чисел.
     3. Программа должна считывать строки для массива с клавиатуры.
     4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести
     на экран.*/
    public static void main(String[] args) throws Exception {

        String[] strArray = getStringArrayInput();
        int[] lengthArray = new int[10];



        for (int i = 0; i < strArray.length; i++) {
            lengthArray[i] = strArray[i].length();
        }

        for (int i: lengthArray) {
            System.out.println(i);
        }
    }

    public static String[] getStringArrayInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = new String[10];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = reader.readLine();
        }

        return strArray;
    }
}
