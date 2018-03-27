package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {

    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private int color;

    /** инициализатор.
     *
     * @param centerX int
     * @param centerY int
     * @param radius int
     */
    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public  void initialize(int centerX, int centerY, int radius, int width) {
        initialize(centerX, centerY, radius);
        this.width = width;
    }

    public  void initialize(int centerX, int centerY, int radius, int width, int color) {
        initialize(centerX, centerY, radius, width);
        this.color = color;
    }

    /**Создать класс Circle
     Создать класс (Circle) круг, с тремя инициализаторами:
     — centerX, centerY, radius
     — centerX, centerY, radius, width
     — centerX, centerY, radius, width, color


     Требования:
     1. Программа не должна считывать данные с клавиатуры.
     2. У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
     3. У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY,
     radius и инициализирующий соответствующие переменные класса.
     4. У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY,
     radius, width и инициализирующий соответствующие переменные класса.
     5. У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY,
     radius, width, color и инициализирующий соответствующие переменные класса.*/
    public static void main(String[] args) {

    }
}
