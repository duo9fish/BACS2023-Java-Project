import java.util.Scanner;

public class Customer {

    private int adultQuantity;
    private int childQuantity;
    private int studentQuantity;
    private final double ADULT_PRICE = 17.00;

    public Customer() {
    }

    public Customer(int adultQauntity, int childQuantity, int studentQuantity) {
        this.adultQuantity = adultQauntity;
        this.childQuantity = childQuantity;
        this.studentQuantity = studentQuantity;
    }

    public int getAdultQuantity() {
        return adultQuantity;
    }

    public int getChildQuantity() {
        return childQuantity;
    }

    public int getStudentQuantity() {
        return studentQuantity;
    }

    public void setAdultQuantity(int adultQuantity) {
        this.adultQuantity = adultQuantity;
    }

    public void setChildQuantity(int childQuantity) {
        this.childQuantity = childQuantity;
    }

    public void setStudentQuantity(int studentQuantity) {
        this.studentQuantity = studentQuantity;
    }

    public double calPrice() {
        return ADULT_PRICE;
    }

    public int inputValidation() {
        int qty;
        Scanner sc = new Scanner(System.in);
        do { //Validation
            System.out.print("\nEnter total quantity of ticket needed: ");
            while (!sc.hasNextInt()) {      
                System.out.println("Invalid input! Please enter NUMBERS ONLY!");
                System.out.print("\nEnter total quantity of ticket needed: ");
                sc.next();  
            }
            qty = sc.nextInt();
            if (qty < 1) {
                System.out.println("Please buy at least ONE ticket!");
            }
            else if (qty > 30) {
                System.out.println("You are not allowed to buy more than 30 tickets at one time!");
            }
            else {
                break;
            }
        } while (qty < 1 || qty > 30); 
        return qty;
    }

    public boolean inputValidation(int qty, int totalQty) {
        if (qty < 0) {
            System.out.println("Invalid input! Please enter POSITIVE NUMBERS ONLY");
            return false;
        }
        else if (qty > totalQty) {
            System.out.println("Ticket count cannot be more than total quantity of tickets needed!");
            return false;
        }
        else {
            return true;
        }
    }

    public void ticketsLeft(int qty) {
        System.out.println("\nTotal tickets left: " + qty);
    }
}