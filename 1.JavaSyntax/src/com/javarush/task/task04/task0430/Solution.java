package com.javarush.task.task04.task0430;

/* 
От 1 до 10
*/


public class Solution {

    /** От 1 до 10
     Вывести на экран числа от 1 до 10 используя цикл while. Каждое значение с новой строки.


     Требования:
     1. Программа не должна считывать числа c клавиатуры.
     2. Программа должна выводить числа на экран.
     3. Каждое значение должно быть выведено с новой строки.
     4. Программа должна выводить числа от 1 до 10.
     5. В программе должен использоваться цикл while.*/
    public static void main(String[] args) throws Exception {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }

    }
}