package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {

    /**Родственные связи кошек

     Готовая задача: у кошки есть имя и кошка-мама. Создать класс, который это описывает. Создать
     два объекта: кошку-дочь и кошку-маму. Вывести их на экран. Новая задача: У каждой кошки есть
     имя, кошка-папа и кошка-мама. Изменить Cat так, чтобы он мог описать эту ситуацию. Создать 6
     объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.

     Родственные связи кошек
     Задача: У каждой кошки есть имя и кошка-мама.
     Создать класс, который бы описывал данную ситуацию.
     Создать два объекта: кошку-дочь и кошку-маму.
     Вывести их на экран.

     Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
     Изменить класс Cat так, чтобы он мог описать данную ситуацию.
     Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
     Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

     Пример ввода:
     дедушка Вася
     бабушка Мурка
     папа Котофей
     мама Василиса
     сын Мурчик
     дочь Пушинка

     Пример вывода:
     Cat name is дедушка Вася, no mother, no father
     Cat name is бабушка Мурка, no mother, no father
     Cat name is папа Котофей, no mother, father is дедушка Вася
     Cat name is мама Василиса, mother is бабушка Мурка, no father
     Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
     Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


     Требования:
     1. Программа должна считывать имена 6 котов в указанном порядке.
     2. Метод main должен создавать 6 объектов типа Cat.
     3. Программа должна выводить 6 строк с информацией о котах.
     4. Строка про дедушку (первая) должна соответствовать условию.
     5. Строка про бабушку (вторая) должна соответствовать условию.
     6. Строка про папу (третья) должна соответствовать условию.
     7. Строка про маму (четвертая) должна соответствовать условию.
     8. Строка про сына (пятая) должна соответствовать условию.
     9. Строка про дочь (шестая) должна соответствовать условию.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGrandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandma);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {

            String result = "Cat name is " + name;

            if (mother == null)
                result += ", no mother ";
            else
                result += ", mother is " + mother.name;

            if (father == null)
                result += ", no father ";
            else
                result += ", father is " + father.name;

            return result;
        }
    }

}
