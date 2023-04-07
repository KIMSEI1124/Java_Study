package code.creature;

import code.abs.Plant;
import code.inter.PhotosynthesisAble;

public class Flower extends Plant implements PhotosynthesisAble {
    @Override
    public void photosynthesis() {
        System.out.println("Flower is Photosynthesising");
    }

    @Override
    public void print() {
        System.out.println("This is Flower!");
    }
}
