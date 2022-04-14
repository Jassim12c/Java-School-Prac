package Assesment;

public class Trade{
    private String customerID;
    private String customerName;
    private String phoneNumber;
    private String shippingAddress;
    private double unitPrice;
    private int quantity;

    public Trade(String customerID,
                 String customerName,
                 String phoneNumber,
                 String shippingAddress,
                 double unitPrice,
                 int quantity){
    this.customerID = customerID;
    this.customerName = customerName;
    this.phoneNumber = phoneNumber;
    this.shippingAddress = shippingAddress;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
    }
        // getters

    public String getCustomerID(){
        return customerID;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getShippingAddress(){
        return shippingAddress;
        }
    public double getUnitPrice(){
        return unitPrice;
        }
    public int getQuantity(){
        return quantity;
        }

        // setters
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString
    public String toString() {
        return customerName + " " + customerID + " " + phoneNumber + " " +
                shippingAddress + " " + unitPrice + " " + quantity;
    }

    // revenue

    public double revenue(){
        return quantity * unitPrice;
    }


}
