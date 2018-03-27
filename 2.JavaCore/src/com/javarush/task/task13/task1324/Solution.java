package com.javarush.task.task13.task1324;

import java.awt.*;

/* 
Один метод в классе
*/

public class Solution {

    /**Один метод в классе

     В этой задачке вам нужно реализовать наследование класса Fox от интерфейса
     Animal. Удалять методы нельзя, но при этом нужно поменять код так, чтобы в
     классе Fox был только один метод — getName.
     *
     * Один метод в классе
     1. Унаследовать Fox от интерфейса Animal.
     2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
     3. Методы удалять нельзя!


     Требования:
     1. Интерфейс Animal должен быть реализован в классе Fox.
     2. В классе Fox должен быть реализован только один метод(getName).
     3. В интерфейсе Animal должен быть объявлен метод getColor.
     4. Дополнительные классы или интерфейсы создавать нельзя.*/
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal{
        public String getName() {
            return "Fox";
        }
    }
}
