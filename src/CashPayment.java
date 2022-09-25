
public class CashPayment extends Payment {
    CashPayment(double amt) {
        super(amt);
    }

    public void paymentDetail() {
        System.out.println("Total Payable(RM): " + this.getAmount());
    }
}
