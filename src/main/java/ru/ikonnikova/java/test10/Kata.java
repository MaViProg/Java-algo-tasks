package ru.ikonnikova.java.test10;

public class Kata {

    public static int mxdiflg (String[] a1, String[] a2) {
        int length1 = Math.abs(findMaxLength(a1) - findMinLength(a2));
        int length2 = Math.abs(findMinLength(a1) - findMaxLength(a2));

        return Math.max(length1, length2);

    }

    public static int findMaxLength(String[] array){
        if (array == null || array.length == 0)
            return -1;

        int maxLength = array[0].length();
        for (String s : array) {
            if(s.length() > maxLength)
                maxLength=s.length();
        }

        return maxLength;
    }

    public static int findMinLength(String[] array){
        if (array == null || array.length == 0)
            return -1;

        int minLength = array[0].length();
        for (String s : array) {
            if(s.length() < minLength)
                minLength=s.length();
        }

        return minLength;
    }
}
