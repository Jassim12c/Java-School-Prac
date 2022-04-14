package Assesment;

public class Wholesale extends Trade {
    private double discountRate;

    public Wholesale(String customerID,
                     String customerName,
                     String phoneNumber,
                     String shippingAddress,
                     double unitPrice,
                     int quantity,
                     double discountRate) {
        super(customerID, customerName, phoneNumber, shippingAddress, unitPrice, quantity);
        this.discountRate = discountRate;
    }

    public double getDiscountRate(){
        return discountRate;
    }

    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }

    public String toString(){
        return super.toString() + " " + discountRate;
    }

    public double revenue(){
        return 0.2 * super.revenue();
    }
}
