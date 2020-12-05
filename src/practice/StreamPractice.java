package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

//        Arrays.fill(intArray, 10);
//        Arrays.stream(intArray).forEach(x -> System.out.print(x + " "));
//        System.out.println();

        int[] ages = {10, 20, 20, 30, 50, 60, 60, 100, 90, 90};
        int[] sortedAges = Arrays.stream(ages).sorted().toArray();

        Arrays.stream(sortedAges).forEach(x -> System.out.print(x + " "));
        System.out.println();

        Arrays.stream(ages).filter(x -> x > 50).forEach(x -> System.out.print(x + " "));
        System.out.println();

        Arrays.stream(sortedAges).filter(x -> x > 50).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int[] sortedAgesAbove50 = Arrays.stream(ages).sorted().filter(x -> x > 50).toArray();
        Arrays.stream(sortedAgesAbove50).forEach(x -> System.out.print(x + " "));
        System.out.println();

        String[] ssn = {"111", "222", "333", "444", "555", "666"};
//        String[] oldSsn = Arrays.stream(ssn).map(x -> x + "SSN").toArray(); 에러 발생
        List<String> newSsn = Arrays.stream(ssn).map(x -> "SSN" + x).collect(Collectors.toList());
        newSsn.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        newSsn.forEach(x -> System.out.print(x + " "));
        System.out.println();

        String combinedSsn = newSsn.stream().collect(Collectors.joining(", ", "<", ">"));
        System.out.println(combinedSsn);

        int[] scores = {50, 100, 60, 90, 100};
        int[] newScores = Arrays.stream(scores).sorted().map(x -> x - 10).toArray();
        Arrays.stream(newScores).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
