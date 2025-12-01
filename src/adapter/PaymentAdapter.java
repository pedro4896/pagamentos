package adapter;

// PaymentAdapter.java
public class PaymentAdapter implements PPay {
    private MPay mpay;

    public PaymentAdapter(MPay mpay) {
        this.mpay = mpay;
    }

    @Override
    public String getCustCardNo() {
        return mpay.getCreditCardNo();
    }

    @Override
    public String getCardOwnerName() {
        return mpay.getCustomerName();
    }

    @Override
    public String getCardExpMonthDate() {
        return mpay.getCardExpMonth() + "/" + mpay.getCardExpYear();
    }

    @Override
    public Integer getCVVNo() {
        return (int) (short) mpay.getCardCVVNo();
    }

    @Override
    public Double getTotalAmount() {
        return mpay.getAmount();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        mpay.setCreditCardNo(custCardNo);
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        mpay.setCustomerName(cardOwnerName);
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        String[] date = cardExpMonthDate.split("/");
        mpay.setCardExpMonth(date[0]);
        mpay.setCardExpYear(date[1]);
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        mpay.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        mpay.setAmount(totalAmount);
    }
}
