package practice.enumpractice;

public class EnumPractice {
    public static void main(String[] args) {
        for (Menu m : Menu.values()) {
            System.out.println(m.getCost());
        }
    }
}
