package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    /**Кошачья бойня
     Создать три кота используя класс Cat.
     Провести три боя попарно между котами.
     Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
     Результат каждого боя вывести на экран c новой строки.


     Требования:
     1. Программа не должна считывать данные с клавиатуры.
     2. Нужно создать три объекта типа Cat.
     3. Нужно провести три боя.
     4. Программа должна вывести результат каждого боя с новой строки.*/
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        for (int i = 0; i < 3; i++) {
            cat[i] = new Cat("Cat" + i, i + 2, i + 5, i + 6);
        }
        for (int i = 0; i < 3; i++) {
            if (i == cat.length - 1) {
                System.out.println(cat[i].fight(cat[0]));
            } else {
                System.out.println(cat[i].fight(cat[i + 1]));
            }
        }

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        /** Constructor, creates cat by name, age, weight and strength.
         *
         * @param name String
         * @param age int
         * @param weight int
         * @param strength int
         */

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        /** Cat fights another.
         *
         * @param anotherCat Cat parameter
         * @return True if battle is won, false otherwise.
         */
        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
