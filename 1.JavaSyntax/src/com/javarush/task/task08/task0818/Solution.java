package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код

        HashMap<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("Аистов", 300);
        salaryMap.put("Аллаяров", 500);
        salaryMap.put("Анисеня", 500);
        salaryMap.put("Байдин", 500);
        salaryMap.put("Басова", 100);
        salaryMap.put("Воротников", 1500);
        salaryMap.put("Гордеева", 2500);
        salaryMap.put("Горелова", 500);
        salaryMap.put("Демидова", 500);
        salaryMap.put("Кондратенков", 500);

        return salaryMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copyMap = new HashMap<>(map);

        for (HashMap.Entry<String, Integer> entry: copyMap.entrySet()) {
            if (entry.getValue() < 500) {
                map.remove(entry.getKey());
            }
        }
    }

    /**Только для богачей

     Наш заказчик — казино «Риге-Тау» с планеты Диблублублу. Крайне заносчивые ребята, но платят
     хорошо. Они заказали нам сделать программу автоматической рассылки писем потенциальным
     клиентам. Не пугайтесь, джуниору (вам) поручена простая задача: создать словарь типа
     «фамилия»-«зарплата» и удалить из него тех, у кого зарплата ниже 500 кредитов.
     *
     * Только для богачей
     Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу:
     «фамилия» - «зарплата».
     Удалить из словаря всех людей, у которых зарплата ниже 500.


     Требования:
     1. Программа не должна выводить текст на экран.
     2. Программа не должна считывать значения с клавиатуры.
     3. Класс Solution должен содержать только три метода.
     4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
     Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
     5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата
     ниже 500.*/
    public static void main(String[] args) {

    }
}