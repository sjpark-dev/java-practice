package practice.enumpractice;

public enum PaymentCode {
    NAVERPAYCODE(100),
    KAKAOPAYCODE(200),
    SAMSUNPAYCODE(300),
    APPLEPAYCODE(400);

    private int paymentCode;

    PaymentCode(int paymentCode) {
        this.paymentCode = paymentCode;
    }

    public int getPaymentCode() {
        return paymentCode;
    }
}
