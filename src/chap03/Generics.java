package chap03;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        // without generics
        ArrayList list1 = new ArrayList();
        list1.add("Hello"); // Object 자료형으로 추가됨
        list1.add("World");

        String hello1 = (String) list1.get(0); // 형변환(casting)을 해야 함
        String java1 = (String) list1.get(1);

        // with generics
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        list2.add("World");

        String hello2 = list2.get(0);
        String java2 = list2.get(1);
    }
}
