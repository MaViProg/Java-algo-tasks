package ru.ikonnikova.java.test3;

/**
 * Given an array of integers, return a new array with each value doubled.
 * <p>
 * For example:
 * <p>
 * [1, 2, 3] --> [2, 4, 6]
 * <p>
 * For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.
 **/
public class Kata {
    public static int[] maps(int[] array) {
        //[1,2,3]
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;

        }

        return array;


    }
}
