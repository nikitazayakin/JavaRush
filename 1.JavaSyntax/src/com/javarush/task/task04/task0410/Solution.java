package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {

    /**Попадём-не-попадём
     Реализовать метод checkInterval. Метод должен проверять попало ли целое число в
     интервал от 50 до 100 и сообщить результат на экран в следующем виде: "Число а
     не содержится в интервале." или "Число а содержится в интервале.", где а — аргумент метода.

     Пример для числа 112:
     Число 112 не содержится в интервале.

     Пример для числа 60:
     Число 60 содержится в интервале.


     Требования:
     1. Программа должна выводить текст на экран.
     2. Метод main не должен вызывать System.out.println() или System.out.print().
     3. Метод main должен вызывать метод checkInterval только два раза.
     4. Метод checkInterval должен быть static void.
     5. Метод checkInterval должен выводить текст на экран согласно заданию.*/
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    /** Checks whether parameters is in interval 50 to 100.
     *
     * @param a integer
     */
    public static void checkInterval(int a) {
        if (a >= 50 && a <= 100) {
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}