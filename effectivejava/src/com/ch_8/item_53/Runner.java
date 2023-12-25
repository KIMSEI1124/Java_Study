package com.ch_8.item_53;

public class Runner {

    private static Calc calc = new Calc();

    public static void main(String[] args) {
        int sum = calc.sum(1, 2, 3, 4, 5);
        System.out.println(sum);

        int minWithBadCase = calc.getMinWithBadCase(1, 2, 3, 4, 5);
        System.out.println(minWithBadCase);

        int minWithGoodCase = calc.getMinWithGoodCase(1, 2, 3, 4, 5);
        System.out.println(minWithGoodCase);
    }
}