package jumptojava.chap05.ex04;

public class Ex04Inheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("poppy");
        System.out.println(dog1.name); // poppy
        dog1.sleep(); // poppy zzz

        // IS-A 관계(Dog is a Animal)
        // 자식 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다
        Animal dog2 = new Dog();
        // 반대는 안된다
        // 부모 클래스로 만들어진 객체를 자식 클래스의 자료형으로는 사용할 수 없다
        // Dog dog = new Animal(); 컴파일 오류: 부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용할 수 없다.

        // 자바에서 만들어지는 모든 클래스는 Object 클래스를 자동으로 상속받게끔 되어 있다
        Object animal = new Animal();
        Object dog3 = new Dog();

        // 메소드 오버라이딩(Method Overriding)
        // 모클래스의 메소드를 자식클래스가 동일한 형태로 또다시 구현하는 행위
        // 메소드 덮어쓰기
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep(); // happy zzz in house

        // 메소드 오버로딩 (method overloading)
        // sleep() 메소드 호출
        houseDog.sleep(); // happy zzz in house
        // sleep(int hour) 메소드 호출
        houseDog.sleep(3); // happy zzz in house for 3 hours

        // 다중 상속
        // 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다.
        // C++, 파이썬 등 많은 언어들이 다중 상속을 지원하지만
        // *** 자바는 다중 상속을 지원하지 않는다. ***
        /* 예시
        class A {
            public void msg() {
                System.out.println("A message");
            }
        }

        class B {
            public void msg() {
                System.out.println("B message");
            }
        }

        class C extends A, B {
            public void static main(String[] args) {
                C test = new C();
                test.msg();
            }
        }

        자바가 다중 상속을 지원한다고 가정하고 A, B 라는 클래스를 위와 같이 동시에 상속(extends A, B)하도록 했다. (실제로는 동작할 수 없는 코드이다.)
        위 main 메소드에서 test.msg(); 실행 시 A 클래스의 msg 메소드를 실행해야 할까? 아니면 B 클래스의 msg 메소드를 실행해야 할까?
        다중 상속을 지원하게 되면 이렇듯 애매모호한 부분이 생기게 된다. 자바는 이러한 불명확한 부분을 애초에 잘라 낸 언어이다.
        ※ 다중상속을 지원하는 다른 언어들은 이렇게 동일한 메소드를 상속받는 경우 우선순위등을 적용하여 해결한다.
         */
    }
}
