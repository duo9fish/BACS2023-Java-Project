import java.util.Scanner;

public class CreditCardPayment extends Payment {
    public String cardId, expireDate, cardNo;

    CreditCardPayment(double amount, String cardId, String expireDate, String cardNo) {
        super(amount);
        this.cardId = cardId;
        this.expireDate = expireDate;
        this.cardNo = cardNo;
    }

    public void paymentDetail() {
        System.out.println("Total Payable(RM): " + this.getAmount() + " by card " + this.cardNo);
    }

    public void validateCardNo() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Invalid Credit Card Number. Example: 1000123412341234");
            System.out.println("Please Try again: ");
            cardNo = sc.nextLine();
        } while (!cardNo.matches("[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"));
        sc.close();
    }
}
