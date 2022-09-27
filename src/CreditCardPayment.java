import java.util.Scanner;

public class CreditCardPayment extends Payment {
    private String cardId, expireDate, cardNo;

    public CreditCardPayment() {
    }

    public void setCardId(String cardID) {
        this.cardId = cardID;
    }

    public String getCardId() {
        return cardId;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setCardNo(String card) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    CreditCardPayment(double amount, String cardId, String expireDate, String cardNo) {
        super(amount);
        this.cardId = cardId;
        this.expireDate = expireDate;
        this.cardNo = cardNo;
    }

    public void paymentDetail() {
        System.out.println("Total Payable(RM): " + this.getAmount() + " by card " + this.cardNo);
    }

    public String validateCardNo(String l) {
        Scanner sc = new Scanner(System.in);
        while (!cardNo.matches("[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
            System.out.println("Invalid Credit Card Number. Example: 1000123412341234");
            System.out.println("Please Try again: ");
            cardNo = sc.nextLine();
        }
        return l;
    }

    public String validateExpireDate(String i) {
        Scanner sc = new Scanner(System.in);
        Boolean retry = true;
        do {
            System.out.print("\nEnter Card Expiry Date: ");
            expireDate = sc.nextLine();
            while (!expireDate.matches("[0-9][1-9]/[0-9][0-9]")) {
                System.out.println("Invalid Expiry Date (MM/YY). Example: 01/25");
                System.out.println("Please Try again: ");
                expireDate = sc.nextLine();
            }
            if (expireDate == null) {
                System.out.println("Card Expiry Date cannot be null. Please try again: ");
                expireDate = sc.nextLine();
            } else {
                retry = false;
            }
        } while (retry);
        return i;
    }

}
