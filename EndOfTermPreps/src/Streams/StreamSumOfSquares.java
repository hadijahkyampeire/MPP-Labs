package Streams;

import java.util.stream.IntStream;

public class StreamSumOfSquares {
    public static void main(String[] args) {
        System.out.println(streamSumOfSquares(3));
    }

    public static Integer streamSumOfSquares(int n) {
        return IntStream.iterate(1, num -> {
            int currentSquare = (int) Math.sqrt(num) + 1;
            return currentSquare * currentSquare;
        }).limit(n).sum();
    }
}
