package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {

    /**Писатель в файл с консоли

     Итак, вам нужно записать кое-что в файл. Для этого первым делом вы читаете с
     консоли имя файла, затем считываете строки до тех пор, пока пользователь не
     введёт слово exit и, наконец, выводите абсолютно все введённые строки в файл,
     каждую строчку с новой строки.
     *
     * Писатель в файл с консоли
     1. Прочесть с консоли имя файла.
     2. Считывать строки с консоли, пока пользователь не введет строку "exit".
     3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


     Требования:
     1. Программа должна считывать c консоли имя файла.
     2. Создай и используй объект типа BufferedWriter.
     3. Программа не должна ничего читать из файловой системы.
     4. Программа должна читывать строки с консоли, пока пользователь не введет
     строку "exit".
     5. Программа должна записать абсолютно все введенные строки (включая "exit")
     в файл, каждую строчку с новой строки.
     6. Метод main должен закрывать объект типа BufferedWriter после использования.

     My notes: Как связаны буферизированные потоки ? */
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            OutputStream oStream = new FileOutputStream(reader.readLine());
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(oStream));


            while (true) {
                String nextLine = reader.readLine();
                writer.write(nextLine);
                writer.newLine();
                if ("exit".equals(nextLine) ) {
                    break;
                }
            }
            writer.close();
            oStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
