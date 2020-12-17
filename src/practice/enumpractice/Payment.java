package practice.enumpractice;

public enum Payment {
    NAVERPAY(PaymentCode.NAVERPAYCODE),
    KAKAOPAY(PaymentCode.KAKAOPAYCODE),
    SAMSUNGPAY(PaymentCode.SAMSUNPAYCODE),
    APPLEPAY(PaymentCode.APPLEPAYCODE);

    private PaymentCode paymentCode;

    Payment(PaymentCode paymentCode) {
        this.paymentCode = paymentCode;
    }

    public PaymentCode getPaymentCode() {
        return paymentCode;
    }
}
