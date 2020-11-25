package chap05.ex04;

public class HouseDog extends Dog {

    // 메소드 오버라이딩(Method Overriding)
    // 동일한 형태(입출력이 동일)의 sleep 메소드를 구현하면
    // HouseDog 클래스의 sleep 메소드가 Dog 클래스의 sleep 메소드보다 더 높은 우선순위를 갖게 되어
    // HouseDog 클래스의 sleep 메소드가 호출되게 된다
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    }

    // 메소드 오버로딩(method overloading)
    // 입력항목이 다른 경우 동일한 이름(sleep)의 메소드를 만들 수 있다
    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}
