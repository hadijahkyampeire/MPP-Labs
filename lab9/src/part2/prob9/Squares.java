package part2.prob9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Squares {
    public static void main(String[] args) {
        printSquares(4);
        System.out.println();
        printSquares(5);
    }

    public static void printSquares(int n) {
        IntStream.iterate(1, i -> getNextSquare(i))
                .limit(n)
                .forEach(square -> System.out.print(square + " "));
    }

    public static int getNextSquare(int currentSquare) {
        int nextSquare = (int) Math.sqrt(currentSquare) + 1;
        return nextSquare * nextSquare;
    }
}
