package jumptojava.chap05.ex04;

public class Dog extends Animal { // 클래스 상속을 위해서는 extends 라는 키워드를 사용
    public void sleep() {
        System.out.println(this.name+" zzz");
    }
}
