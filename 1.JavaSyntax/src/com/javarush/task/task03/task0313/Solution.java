package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

import java.util.ArrayList;

public class Solution {

    int count = 0;
    ArrayList<String> arrList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    /** Мама мыла раму
     Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».

     Подсказка: их 6 штук.
     Каждую комбинацию вывести с новой строки. Слова не разделять.

     Пример:
     МылаРамуМама
     РамуМамаМыла
     ...


     Требования:
     1. Программа должна выводить текст.
     2. Выведенный текст должен содержать 6 строк.
     3. Текст в каждой строке должен быть уникален.
    *4. Должны быть выведены все возможные комбинации.
     */
    public static void main(String[] args) {
        String[] s = {"Мама", "Мыла", "Раму"};
        Solution solution = new Solution();
        //for (int i = 1; i < s.length + 1; i ++)
            solution.permutate(s, 3);
        for (String string : solution.arrList) System.out.println(/*++count + ": " + */string);
        /* System.out.println("МамаМылаРаму");
         System.out.println("МамаРамуМыла");
         System.out.println("МылаМамаРаму");
         System.out.println("МылаРамуМама");
         System.out.println("РамуМылаМама");
         System.out.println("РамуМамаМыла");*/
    }

    private void permutate(String[] arr, int limit){
        permuteIteration(arr, 0, limit);
    }

    private void permuteIteration(String[] arr, int index, int limit){
        //последняя итерация
        if(index >= limit){
            for(int i = 0; i < limit; i++) sb.append(arr[i] /*+ " "*/);
            arrList.add(sb.toString());
            sb.delete(0, sb.length());
            return;
        }

        for(int i = index; i < arr.length; i++){
            String temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permuteIteration(arr, index+1, limit);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
