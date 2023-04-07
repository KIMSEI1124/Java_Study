package code;

import code.creature.Bird;
import code.creature.Flower;
import code.creature.Kim;
import code.creature.Tiger;

public class Run {
    public static void main(String[] args) {
        /* Bird */
        Bird bird = new Bird();
        bird.print();   // Creature
        bird.walk();    // Animal
        bird.fly();     // FlyAble
        /* Flower */
        Flower flower = new Flower();
        flower.print();             // Creature - OverRide
        flower.photosynthesis();    // PhotosynthesisAble
        /* Kim */
        Kim kim = new Kim();
        kim.print();    // Creature
        kim.walk();     // Animal
        kim.read();     // Human
        kim.eat();      // Eatable
        /* Tiger */
        Tiger tiger = new Tiger();
        tiger.print();  // Creature
        tiger.walk();   // Animal
        tiger.eat();    // EatAble
    }
}
