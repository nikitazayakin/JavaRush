package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**Сортировка четных чисел из файла

     Если упорядоченный изоморф не уверен в трезвости другого упорядоченного изоморфа,
     он просит его пройти простенький тестик: сначала ввести имя файла с консоли, прочитать
     из него набор чисел, а затем вывести на консоль только четные, отсортированные по
     возрастанию. Получится?
     *
     * Сортировка четных чисел из файла
     1. Ввести имя файла с консоли.
     2. Прочитать из него набор чисел.
     3. Вывести на консоль только четные, отсортированные по возрастанию.

     Пример ввода:
     5
     8
     11
     3
     2
     10

     Пример вывода:
     2
     8
     10


     Требования:
     1. Программа должна считывать данные с консоли.
     2. Программа должна создавать FileInputStream для введенной с консоли
     строки.
     3. Программа должна выводить данные на экран.
     4. Программа должна вывести на экран все четные числа считанные из
     файла отсортированные по возрастанию.
     5. Программа должна закрывать поток чтения из файла(FileInputStream).*/
    public static void main(String[] args) {
        // напишите тут ваш код

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputFileName = reader.readLine();

            InputStream inputStream = new FileInputStream(inputFileName);
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));

            ArrayList<Integer> arrayList = new ArrayList<>();

            //reading values and taking even vales only
            String inputStr = null;
            while ( (null != (inputStr = inputReader.readLine()))) { //  && (! "".equals(inputStr = inputReader.readLine()) )
                int i = Integer.parseInt(inputStr);
                if (i % 2 == 0) {
                    arrayList.add(i);
                }
            }

            inputStream.close();

            //sorting list of values
            for (int i = 1; i < arrayList.size(); i++) {
                int valueToSort = arrayList.get(i);
                int j = i;
                while (j > 0 && arrayList.get(j - 1) > valueToSort) {
                    arrayList.set(j, arrayList.get(j - 1));
                    j--;
                }
                arrayList.set(j ,valueToSort);
            }

            //printing set of values
            for (int i: arrayList) {
                System.out.println(i);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: File Not Found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
