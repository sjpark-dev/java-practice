package practice;

import java.util.*;

public class DequePractice {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>(Arrays.asList("a", "b", "c", "d", "e"));
        System.out.println(String.join(" ", deque));

        deque.pollFirst();
        System.out.println(String.join(" ", deque));

        deque.pollLast();
        System.out.println(String.join(" ", deque));

        deque.offerFirst("z");
        System.out.println(String.join(" ", deque));

        deque.offerLast("y");
        System.out.println(String.join(" ", deque));
    }
}
