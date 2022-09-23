public class Customer {
    
    private int adultQauntity;
    private int childQuantity;
    private int studentQuantity;
    private final double ADULT_PRICE = 15.00;

    public Customer(int adultQauntity, int childQuantity, int studentQuantity) {
        this.adultQauntity = adultQauntity;
        this.childQuantity = childQuantity;
        this.studentQuantity = studentQuantity;
    }

    public int getAdultQauntity() {
        return adultQauntity;
    }

    public int getChildQuantity() {
        return childQuantity;
    }

    public int getStudentQuantity() {
        return studentQuantity;
    }

    public void setAdultQauntity(int adultQauntity) {
        this.adultQauntity = adultQauntity;
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
    
   
}