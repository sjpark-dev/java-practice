package jumptojava.chap05.ex01;

// 클래스(Class)
public class Animal {
    // 객체 변수(Instance variable) 또는 인스턴스 변수, 멤버 변수, 속성
    String name;
    // *** 객체 변수는 공유되지 않는다 ***

    // 메소드(method) = 클래스 내에 구현된 함수
    public void setName(String name) {
        this.name = name; // this는 Animal 클래스에 의해서 생성된 객체를 지칭
        // cat객체에서 메소드를 호출했다면 this.name은 cat.name으로 해석됨
    }
}
