package chap03;

import java.util.ArrayList;

public class Ex07List {
    public static void main(String[] args) {
        ArrayList<String> ages = new ArrayList<String>();
        ages.add("15"); // [15]
        ages.add("30"); // [15, 30]
        ages.add(1, "29"); // [15, 29, 30]

        System.out.println(ages.get(1)); // 29
        System.out.println(ages.size()); // 3
        System.out.println(ages.contains("30")); // true

        // remove(객체)
        System.out.println(ages.remove("15")); // true(삭제한 결과를 리턴)

        // remove(인덱스)
        System.out.println(ages.remove(1)); // 30(삭제한 항목을 리턴)

        System.out.println(ages); // [29]
    }
}
