package chap05.ex02;

import chap05.ex01.Animal;

public class Ex02Method {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        int c = calculator.sum(a, b);
        System.out.println(c); // 5

        // 평범한 메소드
        // 리턴값받을변수 = 객체.메소드명(입력인수1, 입력인수2, ...)
        int d = calculator.multiply(a, b);
        System.out.println(d); // 6

        // 입력값이 없는 메소드
        // 리턴값받을변수 = 객체.메소드명()
        String e = calculator.inform();
        System.out.println(e); // made by a company

        // 리턴값이 없는 메소드
        // 객체.메소드명(입력인수1, 입력인수2, ...)
        calculator.subtract(b, a); // 3 빼기 2는 1

        // 입력값도 리턴값도 없는 메소드
        // 객체.메소드명()
        calculator.restart(); // 계산기를 재시작 합니다.
    }
}
