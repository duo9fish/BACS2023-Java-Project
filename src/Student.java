import java.util.Scanner;

public class Student extends Customer {
    private double studentPrice;
    private final double DISCOUNT = 0.75;

    public Student() {
    }

    public Student(int adultQauntity, int childQuantity, int studentQuantity) {
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
        } while (qty < 0 || qty > totalQty);
        return qty;
    }

    @Override
    public double calPrice() {
        this.studentPrice = super.calPrice() * DISCOUNT;
        return studentPrice;
    }

    public double calTotalPrice() {
        return calPrice() * (double) super.getStudentQuantity();
    }

    @Override
    public String toString() {
        return "\nStudent Price : " + calPrice() + "\nTotal Student Price : " + calTotalPrice();
    }
}