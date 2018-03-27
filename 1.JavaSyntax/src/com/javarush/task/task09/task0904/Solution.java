package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

public class Solution {

    /**Стек-трейс длиной 10 вызовов

     Мне повезло: в младших классах Марья Ивановна вечно писала на доске фразу: «Функция, вызванная
     последней, должна завершиться самой первой». И заставляла выучить её на память, заверяя, что
     когда-нибуть поймем. Спасибо, Марья Ивановна, кажется, этот день настал. Я даже могу написать
     код, чтобы получить стек-трейс длиной 10 вызовов. А вы можете?
     *
     * Стек-трейс длиной 10 вызовов
     Напиши код, чтобы получить стек-трейс длиной 10 вызовов.


     Требования:
     1. В классе должно быть 10 методов (метод main не учитывать).
     2. Длина стек-трейса в методе method10 должна быть 10.
     3. Каждый метод должен вызывать другой метод.
     4. Используй метод Thread.currentThread().getStackTrace().*/
    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
        System.out.println(stackTraceLength);
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        //напишите тут ваш код
        return method3();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        return method4();
    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        return method5();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return method6();
    }

    public static StackTraceElement[] method6() {
        //напишите тут ваш код
        return method7();
    }

    public static StackTraceElement[] method7() {
        //напишите тут ваш код
        return method8();
    }

    public static StackTraceElement[] method8() {
        //напишите тут ваш код
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
