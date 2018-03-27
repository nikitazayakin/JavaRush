package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {

    /**Омовение Рамы

     Когда-то жил и правил легендарный древнеиндийский царь Рама. И, вероятно, была та, которая
     его родила. Не факт, что она мыла его самостоятельно (царица всё-таки), но да простят нам
     затоки эту невинную историческую фантазию. Напишем программу, которая заменит текст
     «мама мыла раму» на «Мама Мыла Раму».
     *
     * Омовение Рамы
     Написать программу, которая вводит с клавиатуры строку текста.
     Программа заменяет в тексте первые буквы всех слов на заглавные.
     Вывести результат на экран.

     Пример ввода:
     мама мыла раму.

     Пример вывода:
     Мама Мыла Раму.


     Требования:
     1. Программа должна выводить текст на экран.
     2. Программа должна считывать строку с клавиатуры.
     3. Класс Solution должен содержать один метод.
     4. Программа должна заменять в тексте первые буквы всех слов на заглавные.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


        StringBuilder builder = new StringBuilder(s.trim());

        if ( builder.length() > 0 && Character.isAlphabetic(builder.charAt(0)) ) {
            builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
        }
        for (int i = 1; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ' && i + 1 < builder.length() ) {
                for (int j = i + 1; j < builder.length(); j++) {
                    if (Character.isAlphabetic(builder.charAt(j))) {
                        builder.setCharAt(j, Character.toUpperCase(builder.charAt(j)));
                        i = j + 1;
                        break;
                    }
                }
            }
        }

        System.out.println(builder);
        //напишите тут ваш код
    }
}
