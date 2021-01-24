package test10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ikonnikova.java.test10.Kata;


public class KataTest {

    @Test
    public void testMxdiflg () {

        Assertions.assertEquals(13, Kata.mxdiflg(
                new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa",
                        "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"},
                new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));


    }


}
