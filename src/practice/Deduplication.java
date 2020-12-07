package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Deduplication {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("john", "peter", "john", "peter", "tom", "tom", "john"));
        String result = names.stream().collect(Collectors.joining(", ", "old list: [", "]"));
        System.out.println(result);
        
        // 방법 1
        names = names.stream().distinct().collect(Collectors.toList());
        result = names.stream().collect(Collectors.joining(", ", "new list: [", "]"));
        System.out.println(result);

        // 방법 2
        Set<String> set = new HashSet<>(names);
        result = set.stream().collect(Collectors.joining(", ", "set: [", "]"));
        System.out.print(result);
    }
}
