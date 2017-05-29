package com.company;

/**
 * Created by gamzat on 29.05.17.
 */
public class Human {
    int age = 20;

    double getAge(int i, double d, boolean bool, Human human) {
        return age;
    }

    double getAge2(int i, double d, boolean bool, Human human) {
        return human.getAge2(i, d, bool, human);
    }

    public static void main(String[] args) {

        Human human = new Human();
        System.out.println(human.getAge(5, 0.2, true, human));
        //System.out.println(human.getAge2(5, 0.2, true, human));

    }

}
