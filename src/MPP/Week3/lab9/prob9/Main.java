package MPP.Week3.lab9.prob9;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printSquares(9);
    }

    public static void printSquares(int num) {
        IntStream.iterate(1, i -> i + 1)
                .limit(num)
                .forEach(i -> System.out.println(i * i));
    }
}
