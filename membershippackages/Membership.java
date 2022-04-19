package membershippackages;

public abstract class Membership implements Revenue {
    private String firstName;
    private String lastName;
    private String socialID;

    public Membership(){
        firstName = "Jassim";
        lastName = "Alhatem";
        socialID ="58456";
    }
    public Membership(String firstName, String lastName, String socialID){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialID=socialID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSocialID(){
        return socialID;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setSocialID(String socialID){
        this.socialID=socialID;
    }

    public String toString(){
        return "First name:" + firstName + " " + "Last name:" + lastName + " " + "Social id:" + socialID;
    }
    public abstract double getPaymentAmount();

}