package designpattern.adapter;

public class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public void flying() {
        System.out.println(name + "가 날고 있어요!");
    }

    public String getName() {
        return name;
    }
}
