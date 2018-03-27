package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {

    /**Р или Л

     Друзья секретного центра JavaRush с планеты Ки-Тай столкнулись с одной нестандартной для нас 
     проблемой: они плохо различают буквы «р» и «л». Мы решили им помочь следующей задачей. В 
     созданном списке слов экспериментальный метод fix будет удалять из списка строк все слова, 
     содержащие букву «р», а все слова, содержашие букву «л» — удваивать.
     *
     * Р или Л
     1. Создай список слов, заполни его самостоятельно.
     2. Метод fix должен:
     2.1. удалять из списка строк все слова, содержащие букву «р»
     2.2. удваивать все слова содержащие букву «л».
     2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
     2.4. с другими словами ничего не делать.

     Пример:
     роза
     лира
     лоза

     Выходные данные:
     лира
     лоза
     лоза


     Требования:
     1. Программа не должна считывать данные с клавиатуры.
     2. Метод fix должен удалять из списка строк все слова, содержащие букву «р». Исключение: слова
     содержащие и букву «р» и букву «л» - их нужно оставить.
     3. Метод fix должен удваивать слова, содержащие букву «л» (добавлять еще один элемент с этим
     словом). Исключение: слова содержащие и букву «л» и букву «р» - их не нужно удваивать.
     4. Метод fix не должен ничего делать со словами, содержащими и букву «л» и букву «р».
     5. Метод fix не должен ничего делать со словами, которые не содержат ни букву «л»,
     ни букву «р».*/
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);



        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!isCharInString('л',list.get(i)) && isCharInString('р',list.get(i))) {
                list.remove(i);
                i--;
            } else if (isCharInString('л',list.get(i)) && !isCharInString('р',list.get(i))) {
                list.add(i,list.get(i));
                i++;
            }
        }
        return list;
    }
    
    public static boolean isCharInString(char ch, String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }

        return false;
    }
}