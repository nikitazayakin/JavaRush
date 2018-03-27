package com.javarush.task.task08.task0817;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
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
        map.put("Кондратенков", "Борис");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        Collection<String> namesCollection = map.values();

        HashMap<String, Integer> namesCountMap = new HashMap<>();

        for (String str : namesCollection) {

            if (namesCountMap.get(str) == null) {
                namesCountMap.put(str,1);
            } else {
                namesCountMap.put(str,namesCountMap.get(str) + 1);
            }
        }

        for (HashMap.Entry<String,Integer> entry: namesCountMap.entrySet()){
            if (entry.getValue() > 1) {
                removeItemFromMapByValue(map,entry.getKey());
            }
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    /**Нам повторы не нужны

     Сложно представить себе ситуацию, в которой может понадобиться програма, которую мы предлагаем
     вам написать. Впрочем, маленькая модификация, и она обретает практический смысл. Также её можно
     представить частью чего-то большего (поиска?). Давайте создим словарь, занесём в него записи по
     принципу «фамилия» - «имя» и удалим людей с одинаковыми именами.
     *
     * Нам повторы не нужны
     Создать словарь (Map<String, String>) занести в него десять записей по принципу
     «фамилия» - «имя».
     Удалить людей, имеющих одинаковые имена.


     Требования:
     1. Программа не должна выводить текст на экран.
     2. Программа не должна считывать значения с клавиатуры.
     3. Класс Solution должен содержать только четыре метода.
     4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
     String состоящих из 10 записей.
     5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие
     одинаковые имена.
     6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/
    public static void main(String[] args) {

    }
}
