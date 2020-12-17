package practice.enumpractice;

public enum Menu {
    FRIES(10),
    CHEESEBURGER(20),
    MILKSHAKE(30);

    private int cost;

    Menu(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
