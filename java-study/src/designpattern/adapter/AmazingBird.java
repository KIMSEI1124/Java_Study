package designpattern.adapter;

public class AmazingBird implements AmazingFlying {
    private final Bird bird;

    public AmazingBird(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void amazingFlying() {
        System.out.println(bird.getName() + "가 놀라운 방식으로 날고 있어요!");
    }
}
