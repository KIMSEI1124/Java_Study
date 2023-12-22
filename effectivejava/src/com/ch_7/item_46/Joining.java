package com.ch_7.item_46;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public void run() {
        List<String> list = List.of("H", "E", "L", "L", "O");
        String noArgs = list.stream().collect(Collectors.joining());
        String oneArgs = list.stream().collect(Collectors.joining(","));
        String threeArgs = list.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(noArgs);
        System.out.println(oneArgs);
        System.out.println(threeArgs);
    }
}
