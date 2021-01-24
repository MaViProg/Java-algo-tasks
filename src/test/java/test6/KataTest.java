package test6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ikonnikova.java.test6.Kata;


public class KataTest {

    @Test
    public void testSummation() {

        Assertions.assertEquals(36, Kata.summation(8));
        Assertions.assertEquals(1, Kata.summation(1));





    }


}
