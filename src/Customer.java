public class Customer {
    
    private int adultQuantity;
    private int childQuantity;
    private int studentQuantity;
    private final double ADULT_PRICE = 17.00;

    public Customer(int adultQuantity, int childQuantity, int studentQuantity) {
        this.adultQuantity = adultQuantity;
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
}