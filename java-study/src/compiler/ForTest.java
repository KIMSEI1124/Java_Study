package compiler;

public class ForTest {
    public static void main(String[] args) {
        postfixNotation();
        prefixNotation();
    }

    private static void prefixNotation() {
        long sum = 0L;
        for (int i = 0; i < 1_000_000; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void postfixNotation() {
        long sum = 0L;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
