package practice;

public class RegularExpressionPractice {
    public static void main(String[] args) {
        String numbers = "0123456789";
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String hanguel = "가나다";
        System.out.println(numbers.matches("^[0-9]*$"));
        System.out.println(alphabets.matches("^[a-zA-z]*$"));
        System.out.println(hanguel.matches("^[가-힣]*$"));
    }
}
