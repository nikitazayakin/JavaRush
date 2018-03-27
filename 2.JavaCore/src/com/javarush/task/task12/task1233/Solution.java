package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

public class Solution {

    /**Изоморфы наступают

     Раз мы говорим об упорядоченных изоморфах с планеты Линейный Хаос, значит,
     мы собираемся решать задачу на знание алгоритмов. Ибо изоморфы без
     алгоритмов — не изоморфы вовсе. Да и не станут они разговаривать с человеком
     или роботом, который не может найти минимум в массиве и его позицию.
     Но вы-то — сможете?
     *
     * Изоморфы наступают
     Написать метод, который возвращает минимальное число в массиве и его позицию
     (индекс).


     Требования:
     1. Класс Solution должен содержать класс Pair.
     2. Класс Solution должен содержать два метода.
     3. Класс Solution должен содержать метод getMinimumAndIndex().
     4. Метод getMinimumAndIndex() должен возвращать минимальное число в массиве
     и его позицию (индекс).*/
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //напишите тут ваш код
        int min = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }

        return new Pair<>(min, index);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
