package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {

    /**Метод в try..catch

     Вероятно, каждый из вас хотя бы раз в жизни ошибался при вводе пароля или других текстов.
     Давайте защитим программу от случайного ввода «не тех» данных. В задачке пользователь вводит
     с клавиатуры числа, а если он введёт что-то другое, то должен сработать метод,
     перехватывающий исключение, и вывести на экран все ранее введенные числа.
     *
     * Метод в try..catch
     Написать программу, которая будет вводить числа с клавиатуры.
     Код по чтению чисел с клавиатуры должен быть в методе readData.
     Обернуть все тело (код внутри readData) этого метода в try..catch.
     Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить
     исключение и вывести на экран все ранее введенные числа в качестве результата.
     Числа выводить с новой строки сохраняя порядок ввода.


     Требования:
     1. Программа должна считывать данные с клавиатуры.
     2. Метод main не изменять.
     3. Метод main не должен кидать исключений.
     4. Метод readData должен содержать блок try..catch.
     5. Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.*/
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            for (;;) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            for (int item: list) {
                System.out.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
