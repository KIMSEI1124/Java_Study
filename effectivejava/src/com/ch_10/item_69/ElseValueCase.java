package com.ch_10.item_69;

import java.util.Optional;

public class ElseValueCase {
    public void run() {
        Optional<Integer> optional = Optional.empty();

        if (optional.isPresent()) {
            System.out.println(optional.get());
            return;
        }

        System.out.println(optional.orElse(-1));
    }
}
