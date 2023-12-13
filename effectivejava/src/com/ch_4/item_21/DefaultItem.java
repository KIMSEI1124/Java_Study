package com.ch_4.item_21;

public interface DefaultItem {
    default int sum(Number a, Number b) {
        if (a instanceof Integer o1 && b instanceof Integer o2) {
            return o1 + o2;
        }
        throw new RuntimeException();
    }
}
