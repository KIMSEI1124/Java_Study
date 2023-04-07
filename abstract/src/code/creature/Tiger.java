package code.creature;

import code.abs.Animal;
import code.inter.EetAble;

public class Tiger extends Animal implements EetAble {
    @Override
    public void walk() {
        System.out.println("Tiger is Walking");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is Eating");
    }
}
