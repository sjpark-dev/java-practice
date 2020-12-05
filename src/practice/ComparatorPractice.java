package practice;

import java.util.*;

public class ComparatorPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("there are two o's in this sentence.");
        list.add("there are 1 o's in this sentence.");
        list.add("there are 3 o's here oo");
        list.add("there are 5 o's here oooo");
        list.add("there are 4 o's here ooo");

        list.forEach(x -> System.out.println(x));
        System.out.println();

        Collections.sort(list);
        list.forEach(x -> System.out.println(x));
        System.out.println();

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        list.forEach(x -> System.out.println(x));
        System.out.println();

        Comparator<String> numberOfOs = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Arrays.stream(s1.split("")).filter(x -> x.equals("o")).toArray().length
                        - Arrays.stream(s2.split("")).filter(x -> x.equals("o")).toArray().length;
            }
        };

        Collections.sort(list, numberOfOs);

        list.forEach(x -> System.out.println(x));
        System.out.println();
    }
}
