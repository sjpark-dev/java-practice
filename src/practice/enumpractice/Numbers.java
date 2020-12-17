package practice.enumpractice;

public enum Numbers {
    ONE(1, "one", 1),
    TWO(2, "two", 10),
    ZERO(0, "zero", 0);

    private int number;
    private String name;
    private int base2;

    Numbers(int number, String name, int base2) {
        this.number = number;
        this.name = name;
        this.base2 = base2;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBase2() {
        return base2;
    }
}
