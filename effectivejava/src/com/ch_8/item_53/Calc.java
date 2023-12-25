package com.ch_8.item_53;

import java.util.Arrays;

public class Calc {
    public int sum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public int getMinWithBadCase(int... args) {
        if (args.length == 0) {
            throw new RuntimeException("인수가 1개 이상 필요합니다.");
        }
        return Arrays.stream(args).min().getAsInt();
    }

    public int getMinWithGoodCase(int arg, int... args) {
        int min = arg;
        for (int temp : args) {
            min = Math.min(min, temp);
        }
        return min;
    }
}
