package chap05.ex02;

public class Calculator {
    public int sum(int a, int b) { // 입력값
        return a + b; // 리턴값
    }

    /* 메소드의 구조
    public 리턴자료형 메소드명(입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
        ...
        return 리턴값;  // 리턴자료형이 void 인 경우에는 return 문이 필요없다.
    }
     */

    // 평범함 메소드(입력값 o, 리턴값 o)
    public int multiply(int a, int b) {
        return a * b;
    }

    // 입력값이 없는 메소드
    public String inform() {
        return "made by a company";
    }

    // 리턴값이 없는 메소드
    public void subtract(int a, int b) {
        System.out.println(a + " 빼기 " + b + "는 " + (a-b));
    }

    // 입력값도 리턴값도 없는 메소드
    public void restart() {
        System.out.println("계산기를 재시작 합니다.");
    }

    // return의 또 다른 쓰임새
    // 특별한 경우에 메소드를 빠져나가기를 원할 때 return만 단독으로 써서 메소드를 즉시 빠져나갈 수 있다
    // 리턴자료형이 void형인 메소드에만 해당. 리턴자료형이 명시되어 있는 메소드에서 return 문만 작성하면 컴파일 시 오류가 발생
    public void say_nick(String nick) {
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    // 메소드 내에서 선언된 변수의 효력 범위
    public void vartest1(int a) {
        a++; // 로컬 변수(local variable)
        // 메소드 내에서 사용되는 변수는 메소드 안에서만 쓰여지는 변수
    }

    public int vartest2(int a) {
        a++;
        return a;
    }

    int a; // 객체변수 a


    public void vartest3(Calculator calculator) {
        // 메소드가 객체를 전달 받으면 메소드 내의 객체는 전달받은 객체 그 자체로 수행
        calculator.a++;
        // 메소드의 입력항목이 값인지 객체인지를 구별하는 기준은 입력항목의 자료형이 primitive 자료형인지 아닌지에 따라 나뉜다
        // int 자료형과 같은 primitive 자료형인 경우 값이 전달되는 것이고 그 이외의 경우(reference 자료형)는 객체가 전달
    }

    public void vartest4() {
        this.a++;
        // caluculator라는 객체를 이용하여 calculator라는 메소드를 호출할 경우 굳이 calculator라는 객체를 전달할 필요가 없다.
        // 왜냐하면 전달하지 않더라도 vartest4 메소드는 this라는 키워드를 이용하여 객체에 접근할 수 있기 때문이다.
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator calculator = new Calculator();
        calculator.vartest1(a);
        System.out.println(a); // 1

        // a를 1 증가시키고 싶다면(객체를 넘기는 방법)
        a = calculator.vartest2(a);
        System.out.println(a); // 2

        calculator.a = 1;
        calculator.vartest3(calculator);
        System.out.println(calculator.a); // 2

        // 더 좋은 방법(this를 사용하는 방법)
        calculator.a = 1;
        calculator.vartest4();
        System.out.println(calculator.a); // 2
    }
}
