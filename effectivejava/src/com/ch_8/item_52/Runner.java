package com.ch_8.item_52;

public class Runner {

    private static NumberClassifier classifier = new NumberClassifier();
    private static AutoBoxing autoBoxing = new AutoBoxing();

    public static void main(String[] args) {
        Number[] array = {1, 1.0, Long.MAX_VALUE};

        for (Number number : array) {
            System.out.println(classifier.classify(number));
        }

        autoBoxing.run();
    }
}
