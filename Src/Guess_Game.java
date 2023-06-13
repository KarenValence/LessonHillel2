import java.util.Scanner;
import java.util.stream.IntStream;

public class Guess_Game {
    public static void main(String[] args) {
        IntStream.range(0, 101)
                .filter(x -> !String.valueOf(x).contains("4") && !String.valueOf(x).contains("9"))
                .forEach(System.out::println);
    }
}










