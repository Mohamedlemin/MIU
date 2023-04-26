package MPP.Week3.practice.lab9Part2.prob9;

import java.util.stream.Stream;

public class Sequare {
    public static void main(String[] args) {
        printSquares(9);
    }
    public static void printSquares(int num){
        Stream.iterate(1,a ->a + 1)
                .limit(num)
                .forEach(a -> System.out.println(a*a));
    }
}
