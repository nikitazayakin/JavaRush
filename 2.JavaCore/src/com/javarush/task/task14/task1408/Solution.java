package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {

    /**
     * Куриная фабрика
     * <p>
     * Создадим международную куриную фабрику, заселим её курами разного происхождения.
     * Создадим каталог, в котором будем указывать национальность курицы будем подсчитывать,
     * сколько яиц в месяц они несут. Как это сделать? С помощью абстрактных классов и
     * наследования, разумеется.
     */
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            switch (country) {
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
            }
            //напишите тут ваш код
            return hen;
        }
    }

}
