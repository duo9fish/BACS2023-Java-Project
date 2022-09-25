public class Student extends Customer{
    private double studentPrice;
    private final double DISCOUNT = 0.75;

    public Student(int adultQuantity, int childQuantity, int studentQuantity) {
        super(adultQuantity, childQuantity, studentQuantity);
        
    }

    @Override
    public double calPrice() {
        this.studentPrice = super.calPrice() * DISCOUNT;
        return studentPrice;
    }
    
      public double calTotalPrice() {
        return calPrice() * (double)super.getStudentQuantity();
    }

    @Override
    public String toString() {
        return "StudentPrice=" + calPrice() + "\ntotal Student Price = " + calTotalPrice();
    }
}