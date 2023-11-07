package record;

import java.util.Random;

public record Member(
        String name,
        int age) {
    private static final String SAY = "HELLO, RECORD";

    public static Member from(String name) {
        int age = new Random().nextInt(90) + 1;
        return new Member(name, age);
    }

    public String say() {
        return SAY + " I'm " + name;
    }
}
