package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {

    /** Таблица умножения
     Выведи на экран таблицу умножения 10 на 10 в следующем виде:
     1 2 3 …
     2 4 6 …
     3 6 9 …
     …


     Требования:
     1. Программа должна выводить текст.
     2. Выведенный текст должен содержать 10 строк.
     3. Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
     4. Выведенные числа должны быть таблицей умножения.
     */
    public static void main(String[] args) {
        for (int xdim = 1; xdim < 11; xdim++) {

            for (int ydim = 1; ydim < 11; ydim++) {
                System.out.print(xdim * ydim + " ");
                //System.out.printf("%4d",(xdim * ydim));
            }

            System.out.println();
        }
    }
}
