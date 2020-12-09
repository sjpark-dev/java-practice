package jumptojava.chap05.ex08;

public class Ex08AbstractClass {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        System.out.println(tiger.getFood());
        lion.bark();
        System.out.println(tiger.isPredator());
        System.out.println(lion.isPredator());
    }
}
