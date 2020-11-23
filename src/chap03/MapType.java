package chap03;

import java.util.HashMap;

public class MapType {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("apple", "사과"); // key, value
        map.put("orange", "오렌지");

        System.out.println(map.get("apple")); // 사과
        System.out.println(map.containsKey("apple")); // true
        System.out.println(map.remove("apple")); // 사과
        System.out.println(map.size()); // 1
    }
}
