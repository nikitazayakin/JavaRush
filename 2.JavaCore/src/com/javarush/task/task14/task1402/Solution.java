package com.javarush.task.task14.task1402;

/* 
Bingo-2!
*/

public class Solution {

    /**Bingo-2!

     Урок английского на JavaRush: в знаменитом мультике кота совершенно не зря зовут Томом.
     Оказывается, Tomcat на языке Шекспира — это любой кот мужского пола. Очевидно, Tomcat
     является ещё и «просто» котом и может двигаться. Исправьте программу так, чтобы в
     переменной cat хранился объект, который одновременно является и Movable, и Cat, и
     Tomcat.
     */
    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof Movable;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface Movable {
    }

    static class Cat implements Movable {
    }

    static class TomCat extends Cat {

    }
}
