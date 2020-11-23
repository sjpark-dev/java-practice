package chap03;

public class Boolean {
    public static void main(String[] args) {
        boolean isSuccess = true;
        boolean isTest = false;

        // 부울 연산
        isSuccess = 2 > 1;          // true;
        isTest = 1 == 2;            // false;
        isSuccess = 3 % 2 == 1;     // true;
        isTest = "3".equals("2");   // false;

        // 조건문
        int avg = 60;
        int score = 80;
        boolean isPass = score > avg;

        if (isPass) {
            System.out.println("passed the test");
        }

        int i = 2;
        boolean isEven = i % 2 == 0;

        if (isEven) {
            System.out.println("number is even");
        }
    }
}
