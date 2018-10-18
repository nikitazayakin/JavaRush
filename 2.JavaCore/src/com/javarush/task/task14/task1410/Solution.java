package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

/**
 * У 30% роботического населения планеты Сото наблюдается одна зависимость,
 * которая вызывает опасения у остальных 70% роботического населения планеты Сото: алкоголь.
 * Точнее, программирование алкоголя, речь о роботах всё-таки. Наконец-то вы сможете это
 * сделать!
 */
public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}
