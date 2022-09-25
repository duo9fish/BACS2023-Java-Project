import java.util.Scanner;

public class Adult extends Customer {
    private double adultPrice;
    private final double DISCOUNT = 1;

    public Adult() {
    }

    public Adult(int adultQauntity, int childQuantity, int studentQuantity) {
        super(adultQauntity, childQuantity, studentQuantity);
    }

    public int input(int totalQty) {
        int qty;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter quantity of adult tickets needed: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter NUMBERS ONLY!");
                System.out.print("\nEnter quantity of adult tickets needed: ");
                sc.next();
            }
            qty = sc.nextInt();
            if (super.inputValidation(qty, totalQty)) {
                break;
            }
            sc.close();
        } while (qty < 0 || qty > totalQty);

        return qty;
    }

    @Override
    public double calPrice() {
        adultPrice = super.calPrice() * DISCOUNT;
        return adultPrice;
    }

    public double calTotalPrice() {
        return calPrice() * (double) super.getAdultQuantity();
    }

    @Override
    public String toString() {
        return "AdultPrice=" + calPrice() + "\ntotal Adult Price = " + calTotalPrice();
    }
}