package test3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ikonnikova.java.test3.Kata;

public class KataTest {

    @Test
    public void testMaps(){

        Assertions.assertArrayEquals(new int[]{2,4,6}, Kata.maps(new int[]{1,2,3}));
        Assertions.assertArrayEquals(new int[]{0, 2, 4, 6, 8, 10, 12, 14, 16, 18}, Kata.maps(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
        Assertions.assertArrayEquals(new int[]{}, Kata.maps(new int[]{}));

    }


}
