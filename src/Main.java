import adapter.MPay;
import adapter.MpayImpl;
import adapter.PPay;
import adapter.PayPalAdapter;

// Main.java
public class Main {
    public static void main(String[] args) {
        MPay mPay = new MpayImpl();
        mPay.setCustomerName("John Doe");
        mPay.setCreditCardNo("1234567890123456");
        mPay.setCardExpMonth("12");
        mPay.setCardExpYear("23");
        mPay.setCardCVVNo((short) 123);
        mPay.setAmount(100.00);

        // Exibindo MPay
        System.out.println("Sistema MPay:");
        System.out.println("Cartão: " + mPay.getCreditCardNo());
        System.out.println("Titular: " + mPay.getCustomerName());
        System.out.println("Vencimento: " + mPay.getCardExpMonth() + "/" + mPay.getCardExpYear());
        System.out.println("CVV: " + mPay.getCardCVVNo());
        System.out.println("Total: " + mPay.getAmount());

        // Adaptação para PayPal
        PPay payPal = new PayPalAdapter(mPay);

        // Testando o método testPPay
        testPPay(payPal);
    }

    public static void testPPay(PPay pp) {
        System.out.println("\nSistema PayPal Adaptado:");
        System.out.println("Titular do Cartão: " + pp.getCardOwnerName());
        System.out.println("Número do Cartão: " + pp.getCustCardNo());
        System.out.println("Data de Vencimento: " + pp.getCardExpMonthDate());
        System.out.println("CVV: " + pp.getCVVNo());
        System.out.println("Total a Pagar: " + pp.getTotalAmount());
    }
}
