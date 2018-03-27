package com.javarush.task.task12.task1208;

/* 
Свобода печати
*/

public class Solution {

    /**Свобода печати

     На JavaRush — свобода печати, невзирая на секретность. Печатайте что угодно,
     и как угодно. Только создавайте для этого специальные методы, чтобы заодно
     потренироваться в перегрузке этих самых методов. Итак, напишите полдесятка
     методов print с разными параметрами. Какими? Включайте фантазию!
     *
     * Свобода печати
     Написать пять методов print с разными параметрами.


     Требования:
     1. Программа не должна выводить текст на экран.
     2. Класс Solution должен содержать шесть методов.
     3. Класс Solution должен содержать статический метод main().
     4. Класс Solution должен содержать пять статических методов print()
     с разными параметрами.*/
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static void print(int integer) {
        System.out.println(integer);
    }

    public static void print(Integer integer) {
        System.out.println(integer);
    }

    public static void print(){
        System.out.println("no parameter");
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(char[] chArr) {
        System.out.println(chArr);
    }
}
