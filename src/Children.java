import java.util.Scanner;

public class Children extends Customer {
    private double childPrice;
    private final double DISCOUNT = 0.5;

    public Children() {
    }

    public Children(int adultQauntity, int childQuantity, int studentQuantity) {
        super(adultQauntity, childQuantity, studentQuantity);
    }

    public int input(int totalQty) {
        int qty;
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter quantity of children tickets needed: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter NUMBERS ONLY!");
                System.out.print("\nEnter quantity of children tickets needed: ");
                sc.next();
            }
            qty = sc.nextInt();
            if (super.inputValidation(qty, totalQty)) {
                break;
            }
            
        } while (qty < 0 || qty > totalQty);
        return qty;
    }

    @Override
    public double calPrice() {
        this.childPrice = super.calPrice() * DISCOUNT;
        return childPrice;
    }

    public double calTotalPrice() {
        return calPrice() * (double) super.getChildQuantity();
    }

    @Override
    public String toString() {
        return "\nChild Price : " + calPrice() + "\nTotal Child Price : " + calTotalPrice();
    }
}