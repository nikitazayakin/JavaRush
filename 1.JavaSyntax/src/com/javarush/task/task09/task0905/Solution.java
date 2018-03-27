package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {

    /**Там, в синих глубинах стек-трейса…

     Помните золотое правило: функция А вызывает функцию Б, а та вызывает функцию В. И чтобы выйти
     из А, надо сначала выйди из Б, а для этого надо выйти из В. Вспомнили? Вот и хорошо. А тепер
     напишем метод, который возвращает результат – глубину его стек-трейса – количество методов в
     нем (количество элементов в списке). И ещё: пускай это число метод выведет на экран.
     *
     * Там, в синих глубинах стек-трейса…
     Написать метод, который возвращает результат – глубину его стек-трейса – количество методов
     в нем (количество элементов в списке).
     Это же число метод должен выводить на экран.


     Требования:
     1. Метод getStackTraceDeep должен возвращать глубину своего стек-трейса.
     2. Метод getStackTraceDeep должен выводить на экран глубину своего стек-трейса.
     3. Воспользуйся методом Thread.currentThread().getStackTrace().
     4. Метод main должен вызывать метод getStackTraceDeep.*/
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println(elements.length);
        return  elements.length;
    }
}

