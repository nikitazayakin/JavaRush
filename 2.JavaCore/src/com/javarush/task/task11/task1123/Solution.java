package com.javarush.task.task11.task1123;

public class Solution {

    /**Минимакс

     На вступительном экзамене в ясли упорядоченному изоморфу Васеньке с планеты
     Линейный Хаос задали задачку на нахождение максимума и минимума в массиве.
     Как вы помните (или нет), на этой планете все только и заняты упорядочиванием
     и сравнением. Васенька справился. А вы?
     *
     * Минимакс
     Написать метод, который возвращает минимальное и максимальное числа в массиве.


     Требования:
     1. Программа не должна считывать данные с клавиатуры.
     2. Допиши реализацию метода getMinimumAndMaximum, он должен возвращать пару
     из минимума и максимума.
     3. Метод main не изменять.
     4. Программа должна вывести правильный результат.
     5. Метод main должен вызывать метод getMinimumAndMaximum.*/
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //Напишите тут ваше решение
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i :array) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }

        return new Pair<Integer, Integer>(min, max);
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
