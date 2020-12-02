package jumptojava.chap05.ex05;

public class Ex05Constructor {
    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy"); // 생성자 호출 시 문자열을 전달해야 한다.
        HouseDog yorkshire = new HouseDog(1); // 생성자 호출 시 int자료형을 전달해야 한다.
        System.out.println(happy.name); // happy
        System.out.println(yorkshire.name); // yorkshire
    }
}
