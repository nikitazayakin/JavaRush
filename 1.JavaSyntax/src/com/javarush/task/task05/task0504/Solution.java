package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {

    /**Трикотаж
     Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь
     пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
     а точнее — основываясь на нём, как на шаблоне. Их — котов — должно быть трое.
     Наполните этих троих жизнью, то есть, конкретными данными.


     Требования:
     1. Программа не должна считывать данные с клавиатуры.
     2. Нужно создать три объекта типа Cat.
     3. Класс Cat нельзя изменять.
     4. Программа не должена выводить данные на экран.*/
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Cat cat = new Cat("Cat" + i, i + 2, i + 5, i + 6);
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

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
    }
}