package com.javarush.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Player and Dancer
*/

public class Solution {

    /**Player and Dancer

     На планете Терра практически каждый танцор или игрок является человеком. Так и в
     этой программе, часть которой — перед вами. Посмотрите, что она уже умеет делать,
     и измените метод haveRest так, чтобы он вызвал метод play для игрока и
     dance — для танцора.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveRest(person);
        }
    }

    public static void haveRest(Person person) {
        if (person instanceof Player) {
            ((Player) person).play();
        }
        if (person instanceof Dancer) {
            ((Dancer) person).dance();
        }
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
