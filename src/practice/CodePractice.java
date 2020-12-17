package practice;

import java.util.Scanner;

public class CodePractice {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("자동차 이름을 입력해주세요.");
            try {
                Car car = new Car(getCarNamefromUser());
            } catch (Exception e) {
                System.out.println("[ERROR] " + e.getMessage() + "\n");
                continue;
            }
            break;
        }
        System.out.println("감사합니다.");
    }

    private static String getCarNamefromUser() {
        String carName = SCANNER.nextLine();
        System.out.println();
        return carName;
    }
}

class Car {
    private String car;

    public Car(String car) throws IllegalArgumentException {
        validateName(car);
        validateName2(car);
        this.car = car;
    }

    private void validateName2(String car) throws IllegalArgumentException {
        if (car.charAt(0) != 'a') {
            throw new IllegalArgumentException("자동차 이름은 'a'로 시작해야 합니다.");
        }
    }

    private void validateName(String car) throws IllegalArgumentException {
        if (car.length() != 3) {
            throw new IllegalArgumentException("자동차 이름은 3자이어야 합니다.");
        }
    }
}
