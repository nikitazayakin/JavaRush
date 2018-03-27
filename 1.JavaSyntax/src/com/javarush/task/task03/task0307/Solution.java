package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {

    /** Создать 10 зергов, 5 протоссов и 12 терран.
     Дать им всем уникальные имена.


     Требования:
     1. Нужно создать 10 объектов типа Zerg и каждому из них дать свое имя.
     2. Нужно создать 5 объектов типа Protoss и каждому из них дать свое имя.
     3. Нужно создать 12 объектов типа Terran и каждому из них дать свое имя.
     4. Нельзя изменять классы Zerg, Protoss и Terran.
     */
    public static void main(String[] args) {
        // Создать 10 зергов, 5 протоссов и 12 терран.
        Zerg[] zergsArray = new Zerg[10];
        Protoss[] protossesArray = new Protoss[5];
        Terran[] terransArray = new Terran[12];
        for (int i = 0 ; i < 12 ; i++) {

            if (i < 10) {
                zergsArray[i] = new Zerg();
                zergsArray[i].name = "Zerg" + i;
            }

            if (i < 5) {
                protossesArray[i] = new Protoss();
                protossesArray[i].name = "Protoss" + i;
            }

            terransArray[i] = new Terran();
            terransArray[i].name = "Terran" + i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
