package jumptojava.chap04;

import java.util.ArrayList;

public class Ex05ForEach {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};

        // for
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // for each
        for(String number : numbers) {
            System.out.println(number);
        }

        /* for each 문의 구조
        for (type var: iterate) {
            body-of-loop
        }
        iterate부분에는 루프를 돌릴수 있는 형태의 배열 및 ArrayList등이 들어간다
         */

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
