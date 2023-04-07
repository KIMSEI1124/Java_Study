package code.creature;

import code.abs.Animal;
import code.inter.FlyAble;

public class Bird extends Animal implements FlyAble {
    @Override
    public void walk() {
        System.out.println("Bird is Walking");
    }

    @Override
    public void fly() {
        System.out.println("Bird is Flying");
    }
}
