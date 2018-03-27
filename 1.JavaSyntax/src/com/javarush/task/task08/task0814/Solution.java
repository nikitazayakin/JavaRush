package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        Set<Integer> set = new HashSet();

        for (int i = 0; i < 20; i++) {
            set.add(i*2);
        }

        return (HashSet<Integer>) set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> moreThan10Set = new HashSet<>();
        for (Integer i:set) {
            if (i > 10) {
                moreThan10Set.add(i);
            }
        }

        set.removeAll(moreThan10Set);
        return set;
    }

    /**Больше 10? Вы нам не подходите

     Перевалочный пункт Оддиозо ищет сотрудников. Единственное условие: количество конечностей у них
     не должно превышать не более десяти конечностей (мы не знаем, откуда взялась такая
     дискриминация). Поможем им программой, в которой создим множество чисел(Set<Integer>), занесем
     туда 20 различных чисел, а затем удалить из множества все числа больше 10.
     *
     * Больше 10? Вы нам не подходите
     Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
     Удалить из множества все числа больше 10.


     Требования:
     1. Программа не должна выводить текст на экран.
     2. Программа не должна считывать значения с клавиатуры.
     3. Класс Solution должен содержать только три метода.
     4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных
     чисел.
     5. Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.*/
    public static void main(String[] args) {
        HashSet set = createSet();
        set = removeAllNumbersMoreThan10(set);
    }
}
