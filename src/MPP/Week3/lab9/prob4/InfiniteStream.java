package MPP.Week3.lab9.prob4;

import java.util.stream.Stream;

public class InfiniteStream {

    // sol
    final Stream<Integer> primes = Stream.iterate(1,n -> n+2)
            .filter(this::isPrime);
    public void printFirstNPrimes(long N){
        Stream.iterate(2, num -> num + 1)
                .filter(this::isPrime)
                .limit(N)
                .forEach(System.out::println);
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        InfiniteStream ps = new InfiniteStream();
        ps.printFirstNPrimes(10);
        System.out.println("======");
        ps.printFirstNPrimes(5);
    }
}
