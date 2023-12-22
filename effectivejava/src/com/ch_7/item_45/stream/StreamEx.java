package com.ch_7.item_45.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public Stream<?> makeStreamByArray(Object[] array) {
        return Stream.of(array);
    }
}
