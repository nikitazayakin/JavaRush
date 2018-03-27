package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    /** Обмен валют
     Реализуй метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
     Вызови его дважды в методе main с любыми параметрами.
     Результаты выведи на экран, каждый раз с новой строки.

     Подсказка:
     Расчет выполняется по формуле: долларСША = евро * курс


     Требования:
     1. Метод convertEurToUsd должен умножать евро на курс и возвращать полученный результат.
     2. Метод main должен 2 раза вызвать метод convertEurToUsd с любыми параметрами.
     3. Метод main должен выводить результаты вызовов на экран, каждый раз с новой строки.
     4. Метод convertEurToUsd не должен ничего выводить на экран.
     */
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(20,1.23));
        System.out.println(convertEurToUsd(1,1.124));

    }

    public static double convertEurToUsd(int eur, double course) {
        return eur * course;
    }
}
