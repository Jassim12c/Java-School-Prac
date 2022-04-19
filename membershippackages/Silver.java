package membershippackages;

public class Silver extends Membership {
    private double hourlyRate;
    private double hoursNo;

    public Silver(String firstName, String lastName, String socialID,double hourlyRate,double hoursNo){
        super(firstName,lastName,socialID);
        this.hourlyRate = hourlyRate;
        this.hoursNo = hoursNo;
    }
    public void setHourlyRate(double HourlyRate){
        this.hourlyRate = HourlyRate;
    }

    public void setHoursNo(double hoursNo){
        this.hoursNo = hoursNo;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public double getHoursNo(){
        return hoursNo;
    }

    public String toString(){
        return super.toString() + "  " + "Hourly rate: " + hourlyRate + "  " + "Hours No :" + hoursNo;
    }

    public double getPaymentAmount(){
        if (hoursNo <= 40)
            return getHourlyRate() * getHoursNo();
        else
            return (40*getHourlyRate()) +(getHoursNo()-40)*getHourlyRate()*0.15;

    }


}