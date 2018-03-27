package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {

    /**Однофамильцы и тёзки

     К обнаружению тёзок и однофамильцев готовы! Осталось только программу написать для воплощения
     этой светлой цели. Для начала составим словарь Map, куда будем добавлять людей в виде
     «Фамилия»-«Имя». Пускай их будет десять и некоторые из них будут однофамильцами и тезками.
     После этого выведем содержимое Map на экран.

     Однофамильцы и тёзки
     1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
     2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
     3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
     4. Вывести содержимое Map на экран.


     Требования:
     1. Программа должна выводить текст на экран.
     2. Класс Solution должен содержать только три метода.
     3. Метод createPeopleList() должен создавать и возвращать словарь Map с типом элементов String,
     String. Кроме того, добавлять в словарь 10 человек.
     4. В методе createPeopleList() должны добавляться люди с одинаковыми фамилиями.
     5. В методе createPeopleList() должны добавляться люди с одинаковыми именами.
     6. Метод printPeopleList() должен выводить на экран всех людей из словаря Map. Каждое значение
     вывести с новой строки. Фамилия и имя разделены пробелом.
     7. Метод main() должен вызывать метод createPeopleList().
     8. Метод main() должен вызывать метод printPeopleList().*/
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Аистов", "Кирилл");
        map.put("Аллаяров", "Руслан");
        map.put("Анисеня", "Иван");
        map.put("Байдин", "Никита");
        map.put("Басова", "Александра");
        map.put("Воротников", "Алексей");
        map.put("Гордеева", "Ангелина");
        map.put("Горелова", "Анна");
        map.put("Демидова", "Анна");
        map.put("Байдин", "Борис");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
