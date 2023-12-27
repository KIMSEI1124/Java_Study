package com.ch_10.item_69;

import java.util.Optional;

public class OptionCase {
    public void run() {
        Optional<Integer> optional = Optional.of(1);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
    }
}
