package practice;

import java.util.*;
import java.util.stream.Collectors;

public class CheckSameNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        numbers.forEach(System.out::println);

        // 방법 1
        List<Integer> newNumbers = numbers.stream().distinct().collect(Collectors.toList());

        if (numbers.size() == newNumbers.size()) {
            System.out.println("all unique numbers");
        } else {
            System.out.println("not list of unique numbers");
        }

        // 방법 2
        Set<Integer> numbersSet = new HashSet<>(numbers);

        if (numbers.size() == numbersSet.size()) {
            System.out.println("all unqiue numbers");
        } else {
            System.out.println("not list of unique numbers");
        }
    }
}
