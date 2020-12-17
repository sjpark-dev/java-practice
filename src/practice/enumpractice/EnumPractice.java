package practice.enumpractice;

public class EnumPractice {
    public static void main(String[] args) {
        for (Menu m : Menu.values()) {
            System.out.println(m.getCost());
        }

        System.out.println(Payment.valueOf("NAVERPAY").getPaymentCode().getPaymentCode());
        System.out.println(Payment.NAVERPAY.getPaymentCode().getPaymentCode());
    }
}
