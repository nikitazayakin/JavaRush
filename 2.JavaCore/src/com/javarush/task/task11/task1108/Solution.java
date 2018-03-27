package com.javarush.task.task11.task1108;

/* 
Неприступный кот
*/

public class Solution {

    /**Неприступный кот

     Наш бортовой кот — чувствительная натура. Он не желает, чтобы к нему лезли в душу,
     предпочитая темную депрессию компании веселых программистов. Поможем такому коту,
     скроем все внутренние переменные класса Cat, а также методы, позволяющие менять
     внутреннее состояние объектов класса Cat.

     Неприступный кот
     Скрыть все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.


     Требования:
     1. Переменная name класса Cat должна быть скрыта.
     2. Переменная age класса Cat должна быть скрыта.
     3. Переменная weight класса Cat должна быть скрыта.
     4. Геттер getName должен быть публичным.
     5. Сеттер setName должен быть приватным.
     6. Геттер getAge должен быть публичным.
     7. Сеттер setAge должен быть приватным.*/
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }
    }
}
