package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    /**Положительное и отрицательное число
     Ввести с клавиатуры число.
     Если число положительное, то увеличить его в два раза.
     Если число отрицательное, то прибавить единицу.
     Если введенное число равно нулю, необходимо вывести ноль.
     Вывести результат на экран.


     Требования:
     1. Программа должна считывать число c клавиатуры.
     2. Программа должна выводить число на экран.
     3. Если введенное число положительное, необходимо увеличить его в два раза и вывести.
     4. Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
     5. Если введенное число равно нулю, необходимо вывести ноль.*/
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        if (number > 0) {
            number *= 2;
            System.out.println(number);
        } else if (number < 0) {
            number++;
            System.out.println(number);
        } else {
            System.out.println(0);
        }

    }

}