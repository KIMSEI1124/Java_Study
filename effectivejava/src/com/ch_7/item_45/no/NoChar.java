package com.ch_7.item_45.no;

public class NoChar {
    public void run() {
        char[] array = {'h', 'e', 'l', 'l', 'o'};
//        Arrays.stream(array)

        "Hello".chars().forEach(System.out::print);
        // Result : 72101108108111
    }
}
