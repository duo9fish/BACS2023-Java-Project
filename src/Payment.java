public class Payment {
    private double amount;
    private int transactionId;

    // Get amount to print in the bill
    public double getAmount() {
        return amount;
    }

    // Set the amount for paying, gets value from totalPayable
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Gets the transaction ID for every transaction
    public int getTransactionId() {
        return transactionId;
    }

    Payment(double amt) {
        this.amount = Math.round(amt * 100) / 100.0;
    }

    public void paymentDetail() {
        System.out.println("Total Payable (RM): " + this.amount);
    }

    public double totalPayable(double a, double b, double c) {
        return a + b + c;
    }

}
