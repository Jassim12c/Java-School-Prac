package membershippackages;


public class PlatinumPlus extends Platinum {
    private double packageDiscount;


    public PlatinumPlus(String firstName, String lastName, String socialID,double monthlyRate,double MonthsNo, double PackageDiscount){
        super(firstName,lastName ,socialID ,monthlyRate,MonthsNo);
        this.packageDiscount =PackageDiscount;

    }
    public void setPackageDiscount(double packageDiscount){
        this.packageDiscount = packageDiscount;
    }
    public double getPackageDiscount(){
        return packageDiscount;
    }


    public String toString(){
        return super.toString() + "  " + "Package discount: " + packageDiscount;
    }


    public double getPaymentAmount(){
        if (super.getMonthsNo() <= 6)
            return super.getPaymentAmount()-(super.getPaymentAmount()*0.2);
        else
            return super.getPaymentAmount();

    }

}