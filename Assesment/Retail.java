package Assesment;

public class Retail extends Trade {
    private double profitRate;
    private double taxRate;

    public Retail(String customerID,
                  String customerName,
                  String phoneNumber,
                  String shippingAddress,
                  double unitPrice,
                  int quantity,
                  double profitRate,
                  double taxRate) {
        super(customerID, customerName, phoneNumber,
                shippingAddress, unitPrice, quantity);
        this.profitRate = profitRate;
        this.taxRate = taxRate;
    }

    public double getProfitRate(){
        return profitRate;
    }
    public double getTaxRate(){
        return taxRate;
    }

    public void setProfitRate(double profitRate){
        this.profitRate = profitRate;
    }

    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }

    public String toString(){
        return super.toString() + " " + taxRate + profitRate;
    }

    public double revenue(){
        return super.revenue() + (0.3 * super.revenue()) + (0.15 * super.revenue());
    }
}
