package jumptojava.chap04;

import java.util.ArrayList;

public class Ex01If {
    public static void main(String[] args) {
        boolean isQualified = true;

        if (isQualified) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }

        // 비교연산자(<, >, ==, !=, >=, <=)
        int offer = 2000;

        if (offer >= 5000) {
            System.out.println("deal");
        } else {
            System.out.println("no deal");
        }

        // &&(and), ||(or), !(not)
        int cash = 2000;
        boolean hasCard = true;

        if (cash>=5000 || hasCard) {
            System.out.println("take a taxi");
        } else {
            System.out.println("walk");
        }
        /*
        x || y  - x와 y 둘 중 적어도 하나가 참이면 참이다
        x && y  - x와 y 모두 참이어야 참이다
        !x      - x가 거짓이면 참이다
         */

        // contains
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("key");
        pocket.add("smartphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("take a taxi");
        } else {
            System.out.println("walk");
        }

        // else if
        boolean hasCreditCard = true;
        ArrayList<String> bag = new ArrayList<String>();
        bag.add("key");
        bag.add("smartphone");

        if (bag.contains("money")) {
            System.out.println("take a taxi");
        } else if (hasCreditCard) {
            System.out.println("take a taxi");
        } else {
            System.out.println("walk");
        }
    }
}
