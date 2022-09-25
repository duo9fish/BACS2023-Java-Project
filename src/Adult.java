public class Adult extends Customer {
    private double adultPrice;
    private final double DISCOUNT = 1;

    public Adult(int adultQuantity, int childQuantity, int studentQuantity) {
        super(adultQuantity, childQuantity, studentQuantity);
    }

    @Override
    public double calPrice() {
        adultPrice = super.calPrice() * DISCOUNT;
        return adultPrice;
    }
    
      public double calTotalPrice() {
        return calPrice() * (double)super.getAdultQuantity();
    }

    @Override
    public String toString() {
        return "AdultPrice=" + calPrice() + "\ntotal Adult Price = " + calTotalPrice();
    }
}