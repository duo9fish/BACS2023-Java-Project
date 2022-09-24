public class Adult extends Customer {
    private double adultPrice;
    private final double DISCOUNT = 1;

    public Adult(int adultQauntity, int childQuantity, int studentQuantity) {
        super(adultQauntity, childQuantity, studentQuantity);
    }

    @Override
    public double calPrice() {
        adultPrice = super.calPrice() * DISCOUNT;
        return adultPrice;
    }
    
      public double calTotalPrice() {
        return calPrice() * (double)super.getAdultQauntity();
    }

    @Override
    public String toString() {
        return "AdultPrice=" + calPrice() + "\ntotal Adult Price = " + calTotalPrice();
    }
}