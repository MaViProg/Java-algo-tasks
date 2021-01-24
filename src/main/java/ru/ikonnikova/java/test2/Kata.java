package ru.ikonnikova.java.test2;

public class Kata {
    public static String noSpace(String str) {
        // "qwqw 111  22"
        // "qwqw11122"
//        "a b c d".replaceAll("")
        return str.replaceAll(" ", "");
    }

}
