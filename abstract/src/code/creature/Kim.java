package code.creature;

import code.abs.Human;
import code.inter.EetAble;

public class Kim extends Human implements EetAble {
    @Override
    public void walk() {
        System.out.println("Kim is Walking");
    }

    @Override
    public void read() {
        System.out.println("Kim is Reading");
    }

    @Override
    public void eat() {
        System.out.println("Kim is Eating");
    }
}
