public class Payment {
    private double amount;
    private int transactionId;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    Payment(double amt) {
        this.amount = Math.round(amt * 100) / 100.0;
    }

    public void paymentDetail() {
        System.out.println("Total Payable (RM): " + this.amount);
    }
}
