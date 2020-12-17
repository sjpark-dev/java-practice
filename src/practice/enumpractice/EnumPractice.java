package practice.enumpractice;

public class EnumPractice {
    public static void main(String[] args) {
        // values() 메쇼드
        for (Menu m : Menu.values()) {
            System.out.println(m.getCost());
        }

        // valueOf() 메소드
        System.out.println(Payment.valueOf("NAVERPAY").getPaymentCode().getPaymentCode());
        System.out.println(Payment.NAVERPAY.getPaymentCode().getPaymentCode());

        // ordinal() 메소드
        System.out.println(Numbers.ONE.ordinal());
        System.out.println(Numbers.TWO.ordinal());
        System.out.println(Numbers.ZERO.ordinal());

        // name() 메소드
        System.out.println(Numbers.ONE.name());
        System.out.println(Numbers.TWO.name());
        System.out.println(Numbers.ZERO.name());
    }
}
