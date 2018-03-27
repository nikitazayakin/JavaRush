package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Это конец
*/

public class Solution {

    /**Это конец

     Давайте создавать список строк, вводя их с клавиатуры, пока не надоест. Надоесть может в любой
     момент, и на этот случай нужно придумать специальное слово. Пускай этим словом будет «end», то
     есть «конец». А зачем нам эти строки, спросите вы. А мы ответим: затем, чтобы добавлять их в
     список, а затем выводить на экран.
     *
     * Это конец
     Создать список строк.
     Ввести строки с клавиатуры и добавить их в список.
     Вводить с клавиатуры строки, пока пользователь не введет строку «end«. Саму строку «end» не
     учитывать.
     Вывести строки на экран, каждую с новой строки.


     Требования:
     1. Объяви переменную типа список строк и сразу проинициализируй ee.
     2. Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку
     "end".
     3. Саму строку "end" не нужно добавлять в список.
     4. Выведи список на экран, каждое значение с новой строки.
     5. Используй цикл for.*/
    public static void main(String[] args) throws IOException {

        ArrayList<String> strings = new ArrayList<>();

        getStringListInput(strings, "end");

        for (String str: strings) {
            System.out.println(str);
        }

        //напишите тут ваш код
    }

    public static void getStringListInput(List<String> strings, String endString) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (;;) {

            String readString = reader.readLine();

            if (readString.equals(endString)) {
                return;
            }
            strings.add(readString);
        }
    }
}