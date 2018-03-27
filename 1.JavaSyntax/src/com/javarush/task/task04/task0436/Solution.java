package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /**Рисуем прямоугольник
     Ввести с клавиатуры два числа m и n.
     Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

     Пример: m=2, n=4
     8888
     8888


     Требования:
     1. Программа должна считывать два числа c клавиатуры.
     2. Программа должна выводить числа на экран.
     3. Программа должна выводить прямоугольник размером m на n из восьмёрок.
     4. В программе должен использоваться цикл for.*/
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int height = Integer.parseInt(bufferedReader.readLine());
        int width = Integer.parseInt(bufferedReader.readLine());

        for (int heightCounter = 0; heightCounter < height; heightCounter++) {

            for (int widthCounter = 0; widthCounter < width; widthCounter++) {
                System.out.print(8);
            }

            System.out.println();
        }
    }
}
