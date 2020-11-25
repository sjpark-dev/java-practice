package chap05.ex05;

public class HouseDog extends Dog {

    // 생성자(Constructor)
    // 메소드명이 클래스명과 동일하고 리턴 자료형이 없는 메소드를 생성자(Constructor)라고 말한다
    // 생성자는 객체가 생성될 때 호출된다. 객체가 생성될 때는 new라는 키워드로 객체가 만들어질 때이다
    public HouseDog(String name) {
        this.setName(name);
    }

    // 생성자 오버로딩
    // 메소드 오버로딩과 마찬가지 개념이다
    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public void sleep() {
        System.out.println(this.name+" zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}
