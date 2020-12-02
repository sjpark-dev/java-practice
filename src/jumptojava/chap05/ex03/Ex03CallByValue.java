package jumptojava.chap05.ex03;

public class Ex03CallByValue {
    public static void main(String[] args) {

        // 함수 호출 방식
        // 메소드에 값(primitive type)을 전달하는 것과 객체(reference type)를 전달하는 것에는 큰 차이가 있다.
        // 메소드로 객체를 전달할 경우 메소드에서 객체의 객체변수(속성) 값을 변경할 수 있게 된다.

        // Call by Value(values of variables)
        Counter counter1 = new Counter();
        System.out.println("before update:" + counter1.count); // before update:0
        Updater updater1 = new Updater();
        updater1.update1(counter1.count);
        System.out.println("after update:" + counter1.count); // after update:0

        // Call by Reference(address of variables)
        Counter counter2 = new Counter();
        System.out.println("before update:" + counter2.count); // before update:0
        Updater updater2 = new Updater();
        updater2.update2(counter2);
        System.out.println("after update:" + counter2.count); // after update:1
    }
}
