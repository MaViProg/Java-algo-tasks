package ru.ikonnikova.java.test2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KataTest {

    @Test
    public void testNoSpace() {

        Assertions.assertEquals("8aaaaaddddr", Kata.noSpace("8aaaaa dddd r     "));
        Assertions.assertEquals("jfBmgklf8hg88lbe8", Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        Assertions.assertEquals("8jaam", Kata.noSpace("8j aam"));


    }


}
