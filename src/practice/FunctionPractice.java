package practice;

import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Car2 volvo = new Car2(10);

        Function<Car2, Boolean> expression = x -> x.getOil() > 5;
        System.out.println(expression.apply(volvo));

        Function<Integer, Integer> arithmeticExpression = x -> (x + 5) * 2;
        System.out.println(arithmeticExpression.apply(10));
    }
}

class Car2 {
    private int oil;

    public Car2(int oil) {
        this.oil = oil;
    }

    public int getOil() {
        return oil;
    }
}
