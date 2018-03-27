package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {

    /**Переверни массив

     На планете Линейный Хаос во время празника неравнодействия её жители — упорядоченные
     изоморфы — отрываются по полной программе! Огромной популярностью пользуется народная забава
     «переверни массив». Приобщайтесь: создайте массив на 10 чисел, а затем расположите их в
     обратном порядке и выведите на экран. Изоморфы классно отрываются, не так ли?

     Переверни массив
     1. Создать массив на 10 чисел.
     2. Ввести с клавиатуры 10 чисел и записать их в массив.
     3. Расположить элементы массива в обратном порядке.
     4. Вывести результат на экран, каждое значение выводить с новой строки.


     Требования:
     1. Программа должна создавать массив на 10 целых чисел.
     2. Программа должна считывать числа для массива с клавиатуры.
     3. Программа должна выводить 10 строчек, каждую с новой строки.
     4. Массив должен быть выведен на экран в обратном порядке.*/
    public static void main(String[] args) throws Exception {

        int[] numArray = getIntArrayInputReversed();

        printIntArray(numArray);


    }

    public static void printIntArray(int[] numArray) {
        for (int i: numArray) {
            System.out.println(i);
        }
    }

    public static int[] getIntArrayInputReversed() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[10];

        for (int i = intArray.length - 1; i >= 0; i--) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }

        return intArray;
    }
}

