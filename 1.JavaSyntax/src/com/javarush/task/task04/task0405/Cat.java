package com.javarush.task.task04.task0405;

/* 
Реализовать метод setCatsCount
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
    }

    /**Реализовать метод setCatsCount
     Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать
     значение переменной catsCount равное переданному параметру.


     Требования:
     1. Класс Cat должен содержать только одну переменную catsCount.
     2. Переменная catsCount должна быть статической, иметь модификатор доступа private,
     тип int и проинициализирована нулем.
     3. Класс Cat должен содержать два метода setCatsCount и main.
     4. Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount
     равным переданному параметру.*/
    public static void main(String[] args) {

    }
}
