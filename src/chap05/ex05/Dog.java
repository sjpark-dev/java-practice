package chap05.ex05;

public class Dog extends Animal {

    // default 생성자
    // 만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 아래와같은 디폴트 생성자를 추가한다.
    // 하지만 사용자가 작성한 생성자가 하나라도 구현되어 있다면 컴파일러는 디폴트 생성자를 추가하지 않는다.
    public Dog() {

    }

    public void sleep() {
        System.out.println(this.name+" zzz");
    }
}
