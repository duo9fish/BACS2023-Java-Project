public class CreditCardPayment extends Payment {
    String cardId, expireDate, cardNo;

    CreditCardPayment(double amount, String cardId, String expireDate, String cardNo) {
        super(amount);
        this.cardId = cardId;
        this.expireDate = expireDate;
        this.cardNo = cardNo;
    }

    public void paymentDetail() {
        System.out.println("Total Payable(RM): " + this.getAmount() + " by card " + this.cardNo);
    }
}
