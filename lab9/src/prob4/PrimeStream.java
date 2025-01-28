package prob4;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {
    // PART A: CREATE AN INFINITE STREAM OF PRIME NUMBERS
    private final Stream<Integer> primes = Stream.iterate(2, n -> nextPrime(n));


    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int nextPrime(int number) {
        int next = number + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    public void printFirstNPrimes(long n) {
        Stream<Integer> primeStream = Stream.iterate(2, q -> nextPrime(q));
        primeStream.limit(n).forEach(System.out::println);
    }

    public static void main(String[] args) {
        // part B
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
