package ru.ikonnikova.java.test6;

public class Kata {
    public static int summation(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; //sum = sum + i;
        }

        return sum;
    }
}