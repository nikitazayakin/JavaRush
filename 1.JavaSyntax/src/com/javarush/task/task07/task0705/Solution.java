package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {

    /**Один большой массив и два маленьких

     Жил-был массив, и был он большой. В какой-то степени, разумеется. И были у него два
     приятеля-массива, которые были вдвое меньше. Наша задача — манипуляция этими ребятами. Числа
     из большого массива мы должны перенести в два маленьких (в порядке очереди), а затем второй
     маленький массив вывести на экран. Справитесь?

     Один большой массив и два маленьких
     1. Создать массив на 20 чисел.
     2. Ввести в него значения с клавиатуры.
     3. Создать два массива на 10 чисел каждый.
     4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую
     половину во второй маленький.
     5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


     Требования:
     1. Программа должна создавать большой массив на 20 целых чисел.
     2. Программа должна считывать числа для большого массива с клавиатуры.
     3. Программа должна создавать два маленьких массив на 10 чисел каждый.
     4. Программа должна скопировать одну половину большого массива в первый маленький, а
     второю - во второй и вывести его на экран.*/
    public static void main(String[] args) throws Exception {

        int[] bigIntArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        getIntArrayInput(bigIntArray);

        for (int i = 0; i < bigIntArray.length; i++) {
            if (i < 10) {
                smallArray1[i] = bigIntArray[i];
            } else {
                smallArray2[i - 10] = bigIntArray[i];
            }
        }

        printIntArray(smallArray2);
    }

    public static int[] getIntArrayInput(int[] intArray) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(reader.readLine());
        }

        return intArray;
    }

    public static void printIntArray(int[] numArray) {
        for (int i: numArray) {
            System.out.println(i);
        }
    }
}
