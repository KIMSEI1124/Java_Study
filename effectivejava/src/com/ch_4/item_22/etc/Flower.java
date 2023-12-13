package com.ch_4.item_22.etc;

public class Flower {
    private String name;
    private int age;

    private Flower(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Flower of(String name, int age) {
        return new Flower(name, age);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
