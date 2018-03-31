package com.javarush.task.task14.task1409;

/* 
Мосты
*/

//import static jdk.nashorn.internal.objects.Global.println;

/**
 * Мосты
 * <p>Создайте интерфейс Bridge с методом getCarsCount(), подсчитывающим количество машин и классы
 * WaterBridge и SuspensionBridge, которые реализуют этот интерфейс. Метод getCarsCount() должен
 * возвращать любое фиксированное значение типа int и это значение должно быть разным для разных
 * классов.
 */
public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}

