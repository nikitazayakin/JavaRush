package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    /**Семейная перепись

     Попробуем создать программу для семейной переписи. Для этого пишем класс Human с полями
     имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Для тренировки создайте
     объекты и заполните их данные так, чтобы получилось два дедушки, две бабушки, отец, мать, трое
     детей. Выведите объекты на экран.

     Семейная перепись
     Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
     Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое
     детей. Вывести объекты на экран.

     Примечание:
     Если написать свой метод String toString() в классе Human, то именно он будет использоваться
     при выводе объекта на экран.

     Пример вывода:
     Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
     Имя: Катя, пол: женский, возраст: 55
     Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
     …


     Требования:
     1. Программа не должна считывать данные с клавиатуры.
     2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human),
     мать(Human).
     3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
     4. Добавить в класс конструктор public Human(String name, boolean sex, int age,
     Human father, Human mother).
     5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
     6. Выведи созданные объекты на экран.*/
    public static void main(String[] args) {

        ArrayList<Human> humans = new ArrayList<>();

        Human grandpa1 = new Human("grandpa1", true, 55);
        Human grandpa2 = new Human("grandpa2", true, 60);
        Human grandma1 = new Human("grandma1", false, 56);
        Human grandma2 = new Human("grandma2", false, 59);
        Human father = new Human("Papa", true, 39, grandpa1, grandma1);
        Human mother = new Human("Mama", false, 38, grandpa2, grandma2);
        Human son1 = new Human("Влад", true, 5, father, mother);
        Human son2 = new Human("Свят", true, 3, father, mother);
        Human dauther = new Human("Cвета", false, 1, father, mother);

        Collections.addAll(humans,grandpa1,grandma1,grandpa2,grandma2,father,mother,son1,son2,dauther);

        for (Human human:humans) {
            System.out.println(human);
        }
    }

    public static class Human {

        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
    }
}






















