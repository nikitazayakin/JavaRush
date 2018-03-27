package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {

    /**Cамая длинная последовательность

     Если числа повторяются, значит, это кому-нибудь нужно? В данный момент это нужно нам, чтобы
     потренироваться решать задачи на списки. Давайте создадим список чисел и добавим в него 10
     чисел с клавиатуры. Наша задача состоит в том, чтобы вывести на экран длину самой длинной
     последовательности повторяющихся чисел в списке.
     *
     * Cамая длинная последовательность
     1. Создай список чисел.
     2. Добавь в список 10 чисел с клавиатуры.
     3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

     Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
     3

     Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из
     трех четверок.


     Требования:
     1. Программа должна выводить число на экран.
     2. Программа должна считывать значения с клавиатуры.
     3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу
     проинициализируй ee.
     4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
     5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся
     чисел в списке.*/
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> intList = new ArrayList<>();
        int maxSequenceLength = 0;
        int sequenceLength = 0;
        Integer sequenceInt = null;
        for (int i = 0; i < 10; i++) {

            intList.add(Integer.parseInt(reader.readLine()));

            if (sequenceInt == null) {
                sequenceInt = intList.get(i);
                sequenceLength++;
            } else if (sequenceInt.equals(intList.get(i))) {
                sequenceLength++;
            } else {
                sequenceInt = intList.get(i);
                sequenceLength = 1;
            }

            if (sequenceLength > maxSequenceLength) {
                maxSequenceLength = sequenceLength;
            }
        }

        System.out.println(maxSequenceLength);
    }
}