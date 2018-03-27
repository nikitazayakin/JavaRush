package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {

    /**Том, Джерри и Спайк

     Реализуйте взаимоотношения Тома, Джерри и бульдога Спайка с помощью классов
     и интерфейсов. Кот может двигаться и передвигаться, может кого-то съесть или
     быть съеденным. Мышка может передвигаться и быть съеденной. Ну а пёс может
     передвигаться и съесть кого-то (кого захочет!).

     Том, Джерри и Спайк
     1. Создай классы Dog, Cat и Mouse.
     2. Реализуй интерфейсы в добавленных классах, учитывая что:
     - Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
     - Мышь(Mouse) может передвигаться и может быть съедена.
     - Собака(Dog) может передвигаться и съесть кого-то.


     Требования:
     1. Класс Cat должен быть объявлен внутри класса Solution.
     2. Класс Dog должен быть объявлен внутри класса Solution.
     3. Класс Mouse должен быть объявлен внутри класса Solution.
     4. Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
     5. Мышь(Mouse) может передвигаться и может быть съедена.
     6. Собака(Dog) может передвигаться и съесть кого-то.*/
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Eat, Eatable {

        @Override
        public void move() {

        }

        @Override
        public void eaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Dog implements Movable, Eat {

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements Movable, Eatable {

        @Override
        public void move() {

        }

        @Override
        public void eaten() {

        }
    }
}