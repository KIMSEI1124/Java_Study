package com.ch_8.item_52;

public class NumberClassifier {
    public String classify(Integer number) {
        return "Integer";
    }

    public String classify(Double number) {
        return "Double";
    }

//    public String classify(Number number) {
//        return "Number";
//    }

    public String classify(Number number) {
        return number instanceof Integer ? "Integer" :
                number instanceof Double ? "Double" :
                        "Number";
    }
}
