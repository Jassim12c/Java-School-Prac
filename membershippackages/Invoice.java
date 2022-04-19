package membershippackages;

public class Invoice implements Revenue {
    private String invoiceNumber;
    private String membershipPackageName;
    private int numberOfClients;
    private double PricePerClient;


    public Invoice(String invoiceNumber, String membershipPackageName, int numberOfClients, double pricePerClient){
        this.invoiceNumber = invoiceNumber;
        this.membershipPackageName = membershipPackageName;
        this.numberOfClients = numberOfClients;
        this.PricePerClient = pricePerClient;
    }
    public void setInvoiceNumber(String invoiceNumber){
        this.invoiceNumber = invoiceNumber;
    }
    public void setMembershipPackageName(String MembershipPackageName){
        this.membershipPackageName =MembershipPackageName;
    }
    public void setNumberOfClients(int NumberOfClients){
        this.numberOfClients =NumberOfClients;
    }
    public void setPricePerClient(double PricePerClient){
        this.PricePerClient=PricePerClient;
    }
    public String getInvoiceNumber(){
        return invoiceNumber;
    }
    public String getMembershipPackageName(){
        return membershipPackageName;
    }
    public int getNumberOfClients(){
        return numberOfClients;
    }
    public double getPricePerClient(){
        return PricePerClient;
    }
    public String toString(){
        return "Invoice Number: " + invoiceNumber + "   " + "Memership Package Name: " + membershipPackageName +
                "   " + "Number Of Clients: " + numberOfClients + "   " + "PricePerClient: " + PricePerClient;
    }

    public double getPaymentAmount() {
        return getNumberOfClients() * getPricePerClient();
    }
}