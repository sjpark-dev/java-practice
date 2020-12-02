package jumptojava.chap03;

public class Ex04String {
    public static void main(String[] args) {
        String a = "Hello"; // literal 방식
        String b = new String("Hello"); // new 키워드 방식
        // 가급적 첫번째 방식 사용

        /* 원시(primitive) 자료형
        int, long, double, float, boolean, char 등은 자바의 primitive 자료형
        primitive 자료형은 new 키워드로 생성 불가(literal로 값을 세팅해야 함)
        String은 literal로 세팅되지만 primitive 자료형이 아님(String은 리터럴 표현식을 쓸 수 있는 특별한 자료형)
         */

        // equals
        String c = "hello";
        String d = "hello";
        String e = new String("hello");
        System.out.println(c.equals(d));    // true(동일한 값인지 확인)
        System.out.println(c==d);           // true(동일한 객체인지 확인)
        System.out.println(c.equals(e));    // true(동일한 값인지 확인)
        System.out.println(c==e);           // false(동일한 객체인지 확인)

        // indexOf
        String f = "Hello World";
        System.out.println(f.indexOf("World")); // 6(없다면 -1)

        // replaceAll
        String g = "Hello Earth";
        System.out.println(g.replaceAll("Earth", "World")); // Hello World

        // substring
        String h = "Hello World";
        System.out.println(h.substring(0, 5)); // Hello

        // toUpperCase, toLowerCase
        String i = "Hello World";
        System.out.println(i.toUpperCase()); // HELLO WORLD
        System.out.println(i.toLowerCase()); // hello world
    }
}
