package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {

    /**Три метода и минимум

     Можем ли мы сравнить два числа разного типа? Человеческие существа, в подавляющем
     большинстве с этой задачей справляются. А вот роботам — тяжко. Сравнивать double
     с int для них, как для людей сравнивать тёплое с мягким. Не будем утомлять роботов:
     создадим 3 перегруженных метода min для long, double и int.
     *
     * Три метода и минимум
     Написать public static методы: int min(int, int), long min(long, long), double
     min(double, double).
     Каждый метод должен возвращать минимальное из двух переданных в него чисел.


     Требования:
     1. Программа не должна выводить текст на экран.
     2. Класс Solution должен содержать четыре метода.
     3. Класс Solution должен содержать статический метод int min(int, int).
     4. Метод int min(int, int) должен возвращать минимальное из двух чисел типа int.
     5. Класс Solution должен содержать статический метод long min(long, long).
     6. Метод long min(long, long) должен возвращать минимальное из двух чисел типа long.
     7. Класс Solution должен содержать статический метод double min(double, double).
     8. Метод double min(double, double) должен возвращать минимальное из двух чисел
     типа double.*/
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int num1, int num2) {

        return (num1 <= num2) ? num1 : num2;
    }

    public static long min(long num1, long num2) {

        return (num1 <= num2) ? num1 : num2;
    }

    public static double min(double num1, double num2) {

        return (num1 <= num2) ? num1 : num2;
    }
}
