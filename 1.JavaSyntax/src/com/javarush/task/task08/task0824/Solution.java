package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Solution {

    /**Собираем семейство

     Попробуем создать программу для семейной переписи. Для этого пишем класс Human с полями
     имя(String), пол(boolean), возраст(int), дети (ArrayList Human). Для тренировки создайте
     объекты и заполните их данные так, чтобы получилось два дедушки, две бабушки, отец, мать,
     трое детей. Выведите объекты на экран.

     Собираем семейство
     1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети
     (ArrayList<Human>).
     2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки,
     отец, мать, трое детей.
     3. Вывести все объекты Human на экран.


     Требования:
     1. Программа должна выводить текст на экран.
     2. Класс Human должен содержать четыре поля.
     3. Класс Human должен содержать один метод.
     4. Класс Solution должен содержать один метод.
     5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два
     дедушки, две бабушки, отец, мать, трое детей.*/
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human();
        Human child2 = new Human();
        child2.name = "name2";
        Human child3 = new Human();
        child3.name = "name3";
        Human father = new Human();
        father.name = "Father";
        Collection<Human> collection = new HashSet<>();
        collection.add(child1);
        collection.add(child2);
        collection.add(child3);
        father.children.addAll(collection);
        Human mother = new Human();
        mother.name = "Mother";
        mother.sex = false;
        mother.children.addAll(collection);
        Human grandPa1 = new Human();
        grandPa1.children.add(father);
        Human grandMa1 = new Human();
        grandMa1.name = "GrandMa1";
        grandMa1.sex = false;
        grandMa1.children.add(father);
        Human grandPa2 = new Human();
        grandPa2.children.add(mother);
        Human grandMa2 = new Human();
        grandMa2.sex = false;
        grandMa2.children.add(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandPa1);
        System.out.println(grandMa1);
        System.out.println(grandPa2);
        System.out.println(grandMa2);
    }

    public static class Human {
        //напишите тут ваш код
        public String name = "name";
        public boolean sex = true;
        public int age = 15;
        public ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
