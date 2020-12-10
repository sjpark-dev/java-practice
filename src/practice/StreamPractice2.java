package practice;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice2 {
    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(number -> System.out.print(number + " "));
        System.out.println();
        new Random().ints(5, 1, 10).forEach(number -> System.out.print(number + " "));
        System.out.println();
        Stream.of("hello", "how", "are", "you", "today").forEach(System.out::println);
    }
}
