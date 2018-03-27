package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {

    /**И снова StackTrace

     Давайте сразу перейдем к делу: напишите 5 методов, которые вызывают друг друга. Каждый метод
     должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace. Это имя —
     дальше, чем звезды. Но мы разберемся, это всего-навсего методы, которые последовательно
     вызывают друг друга, и ничего более.
     *
     * И снова StackTrace
     Написать пять методов, которые вызывают друг друга.
     Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.


     Требования:
     1. В классе должно быть 5 методов (метод main не учитывать).
     2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2
     и т.д.
     3. Каждый метод должен возвращать имя метода, вызвавшего его.
     4. Для получения имени вызвавшего метода, используй метод getMethodName.*/
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        //System.out.println(elements[2].getMethodName());
        return elements[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }
}
