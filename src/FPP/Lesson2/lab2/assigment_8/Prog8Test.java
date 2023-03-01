package FPP.Lesson2.lab2.assigment_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prog8Test {

    @Test
    void min() {
        int[] input = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int expected = -22;
        int actual = Prog8.min(input);
        assertEquals(expected, actual);
    }
}