package chap03;

public class Number {
    public static void main(String[] args) {

        // 정수
        int a = 10;
        long b = 10L;
        int octal = 023; // 16(0으로 시작하면 8진수)
        int hex = 0xC; // 12(0x으로 시작하면 16진수)

        // 실수
        float c = 3.14F;
        double d = 3.14;
        double f = 3.145e2; // 314.5

        // 숫자연산
        int x = 10;
        int y = 3;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y); // 3(몫)
        System.out.println(x%y); // 1(나머지)

        //증감연산
        int z = 0;
        System.out.println(z++); // 0(참조된 후에 증가)
        System.out.println(z); // 1
        System.out.println(++z); // 2(참조되기 전에 증가)
        System.out.println(z); // 2
        // --연산자도 마찬가지
    }
}
