package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

// import java.io.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /**Правило треугольника
     Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
     Определить возможность существования треугольника по сторонам.
     Результат вывести на экран в следующем виде:
     «Треугольник существует.» — если треугольник с такими сторонами существует.
     «Треугольник не существует.» — если треугольник с такими сторонами не существует.

     Подсказка:
     Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
     Требуется сравнить каждую сторону с суммой двух других.
     Если хотя бы в одном случае сторона окажется больше или равна сумме двух других, то
     треугольника с такими сторонами не существует.


     Требования:
     1. Программа должна считывать числа c клавиатуры.
     2. Программа должна выводить текст на экран.
     3. Если треугольник с такими сторонами может существовать, необходимо вывести текст:
     "Треугольник существует."
     4. Если треугольник с такими сторонами не может существовать, необходимо вывести текст:
     "Треугольник не существует."*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int aSide = Integer.parseInt(bufferedReader.readLine());
        int bSide = Integer.parseInt(bufferedReader.readLine());
        int cSide = Integer.parseInt(bufferedReader.readLine());

        triangleExists(aSide,bSide,cSide);
    }

    /** Checks wheter triangle with given sides exists or not and outputs the result
     *  to console.
     * @param aSide side A of triangle (int)
     * @param bSide side B of triangle (int)
     * @param cSide side C of triangle (int)
     */
    public static void triangleExists(int aSide, int bSide, int cSide) {
        if ((aSide + bSide > cSide) && (aSide + cSide > bSide) && (bSide + cSide > aSide)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}