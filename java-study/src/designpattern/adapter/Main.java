package designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("참새");
        AmazingBird amazingBird = new AmazingBird(bird);
        amazingBird.amazingFlying();
    }
}
