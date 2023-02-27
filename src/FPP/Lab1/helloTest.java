package FPP.Lab1;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class helloTest {

    @org.junit.jupiter.api.Test
    void sayHello() {
        String expected = "Hello Mohamed lemin";
        String res = hello.sayHello();
        assertEquals(expected,res);
    }
}