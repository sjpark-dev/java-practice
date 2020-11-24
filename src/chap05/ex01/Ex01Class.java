package chap05.ex01;

public class Ex01Class {
    public static void main(String[] args) {
        Animal cat = new Animal(); // cat은 객체(Object), cat은 Animal의 인스턴스
        Animal dog = new Animal();
        Animal horse = new Animal();

        // 도트연산자(.)
        System.out.println(cat.name); // null
        dog.name = "Apple";
        System.out.println(dog.name); // Apple

        // 메소드 호출
        cat.setName("Melon");
        horse.setName("Thunder");
        System.out.println(cat.name); // Melon
        System.out.println(horse.name); // Thunder
        // *** 객체 변수는 공유되지 않는다 ***
    }
}
