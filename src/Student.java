public class Student extends Customer{
    private double studentPrice;
    private double DISCOUNT = 0.75;

    public Student(double studentPrice, int adultQauntity, int childQuantity, int studentQuantity) {
        super(adultQauntity, childQuantity, studentQuantity);
        this.studentPrice = studentPrice;
    }

    @Override
    public double calPrice() {
        studentPrice = super.calPrice() * DISCOUNT;
        return studentPrice;
    }
    
    
}
