package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {

    /**Int и Integer

     В конце первого квеста вы узнали, что для каждого примитивного класса в
     Java существует его непримитивный аналог. Скоро эти непримитвные будут
     везде, помяните моё слово! А пока — напишем два разных метода вывода
     на экран, один для примитивного типа int, второй — для непримитивного
     Integer.

     Int и Integer
     Написать два метода: print(int) и print(Integer).
     Написать такой код в методе main, чтобы вызвались они оба.


     Требования:
     1. Класс Solution должен содержать статический метод main().
     2. Класс Solution должен содержать статический метод print() с параметром типа int.
     3. Класс Solution должен содержать статический метод print() с параметром типа Integer.
     4. Метод main() должен вызывать метод print() с параметром типа int.
     5. Метод main() должен вызывать метод print() с параметром типа Integer.*/
    public static void main(String[] args) {
        print(5);
        print(new Integer(6));
    }

    //Напишите тут ваши методы
    public static void print (int integer) {
        System.out.println(integer);
    }

    public static void print (Integer integer) {
        System.out.println(integer);
    }
}
