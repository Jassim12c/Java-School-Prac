package membershippackages;

public class Gold extends Membership {
    private double weeklyRate;
    private double weeks;

    public Gold(String firstName, String lastName, String socialID,double weeklyRate,double weeks){
        super(firstName,lastName,socialID);
        this.weeklyRate = weeklyRate;
        this.weeks = weeks;
    }
    public void setWeeklyRate(double weeklyRate){
        this.weeklyRate = weeklyRate;
    }

    public void setWeeks(double weeks){
        this.weeks = weeks;
    }

    public double getWeeklyRate(){
        return weeklyRate;
    }

    public double getWeeks(){
        return weeks;
    }

    public String toString(){
        return super.toString() + "  " + "Weekly rate: " + "  " + weeklyRate + "  " + "Weeks :" + weeks;
    }
    public double getPaymentAmount(){
        return getWeeks() * getWeeklyRate();
    }

}