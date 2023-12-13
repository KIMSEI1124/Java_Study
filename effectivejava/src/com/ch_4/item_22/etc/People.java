package com.ch_4.item_22.etc;

public class People implements Animal {
    private String name;
    private int age;

    private People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static People of(String name, int age) {
        return new People(name, age);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
