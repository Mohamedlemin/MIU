package MPP.Week3.inclassExo;

import java.util.stream.Stream;

public class reduce {
    public static void main(String[] args) {
        System.out.println( Stream.of("A","good").reduce((x,y) -> x+" "+ y).get());


    }
}
