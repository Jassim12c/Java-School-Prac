package membershippackages;

public class Platinum extends Membership {
    private double monthlyRate;
    private double monthsNo;

    public Platinum (String firstName, String lastName, String socialID,double monthlyRate,double monthsNo){
        super(firstName,lastName,socialID);
        this.monthlyRate = monthlyRate;
        this.monthsNo = monthsNo;
    }

    public void setMonthlyRate(double monthlyRate){
        this.monthlyRate = monthlyRate;
    }

    public double getMonthsNo(){
        return monthsNo;
    }

    public double getMonthlyRate(){
        return monthlyRate;
    }
    public void setMonthsNo(double monthsNo){
        this.monthsNo = monthsNo;
    }

    public String toString(){
        return super.toString() + "  " + "Mothly rate: "+ monthlyRate + "  " + "Month no: " + monthsNo;
    }
    public  double getPaymentAmount(){
        return getMonthlyRate() * getMonthsNo();
    }

}