package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {

    /**Set из котов

     Вам необходимо создать кошачье множество. Для этого нужен класс public static Cat.
     Затем реализуйте метод createCats, который должен создавать Set из котов и добавлять
     в него 3 котов. В методе main удалите одного кота из Set cats. И, наконец, реализуйте
     метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
     *
     * Set из котов
     1. Внутри класса Solution создать public static класс кот – Cat.
     2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в
     него 3 кота.
     3. В методе main удалите одного кота из Set cats.
     4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались
     во множестве.
     Каждый кот с новой строки.


     Требования:
     1. Программа должна выводить текст на экран.
     2. Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
     3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 3 кота.
     4. Метод printCats() класса Solution должен вывести на экран всех котов из множества.
     Каждый кот с новой строки.
     5. Метод main() должен вызывать метод createCats().
     6. Метод main() должен вызывать метод printCats().
     7. Метод main() должен удалять одного кота из множества котов.*/
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Set<Cat> copy = new HashSet<>(cats);

        Iterator iterator = copy.iterator();

        if (iterator.hasNext()) {
            cats.remove(iterator.next());
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();

        int size = cats.size();
        while (cats.size() < size+3){
            cats.add(new Cat());
        }

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat {

        public Cat() {

        }
    }
}
