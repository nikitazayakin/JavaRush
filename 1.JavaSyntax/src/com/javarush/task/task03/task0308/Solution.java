package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {

    /** Произведение 10 чисел
     Вывести на экран произведение 10 чисел от 1 до 10.
     Результат — это 1 число.

     Подсказка:
     будет три миллиона с хвостиком.


     Требования:
     1. Программа должна выводить целое число на экран.
     2. Метод main должен вызывать функцию System.out.println.
     3. Выведенное число должно быть больше трех миллионов.
     4. Выведенное число должно соответствовать заданию.
     */
    public static void main(String[] args) {
        int multiplier = 1;
        for (int count = 1; count < 11; count++) {
            multiplier *= count;
        }
        System.out.println(multiplier);
    }
}
