package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {

    /**Конструкторы класса Human

     Люди — разные, и у каждого человека различные важные особенности. Скажем,
     этот — новорожденный, и у него есть только имя и мама, а этот — музыкант,
     и для него важны уровень исполнительского мастерства и его группа. Давайте
     напишем класс Human с 6 полями и придумаем для него 10 различных конструкторов.
     Каждый конструктор должен иметь смысл.
     *
     * Конструкторы класса Human
     Напиши класс Human с 6 полями.
     Придумай и реализуй 10 различных конструкторов для него.
     Каждый конструктор должен иметь смысл.


     Требования:
     1. Программа не должна считывать данные с клавиатуры.
     2. В классе Human должно быть 6 полей.
     3. Все поля класса Human должны быть private.
     4. В классе Human должно быть 10 конструкторов.
     5. Все конструкторы класса Human должны быть public.*/
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        private boolean isMusician;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(boolean sex, int age) {
            this.sex = sex;
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother, boolean isMusician) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.isMusician = isMusician;
        }

        public Human(String name, boolean sex, int age, boolean isMusician) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.isMusician = isMusician;
        }

        public Human(String name, boolean sex, boolean isMusician) {
            this.name = name;
            this.sex = sex;
            this.isMusician = isMusician;
        }


        public Human(String name, boolean sex, int age, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
        }
    }
}
