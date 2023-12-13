package com.ch_4.item_22.etc;

public class Runner {
    public static void main(String[] args) {
        Object kim = People.of("김정욱", 26);
        Object cherryBlossom = Flower.of("벚꽃", 30);

        if (kim instanceof Animal animal) {
            System.out.println(animal);
        }
        if (cherryBlossom instanceof Animal animal) {
            System.out.println(animal);
        }
    }
}
