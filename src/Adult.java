public class Adult extends Customer {
    private double adultPrice;
    private final double DISCOUNT = 0;

    public Adult(int adultQauntity, int childQuantity, int studentQuantity) {
        super(adultQauntity, childQuantity, studentQuantity);
    }



    @Override
    public double calPrice() {
        adultPrice = super.calPrice() * DISCOUNT;
        return adultPrice;
    }


    
    
    
}