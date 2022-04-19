package membershippackages;

public class MembershipPackages {


    public static void main(String[] args) {

        // Class instances

        Platinum platMembership = new Platinum ("Jassim","Alhatem","58456",1,3);
        Gold goldMembership = new Gold ("Jassim","Alhatem","58456",2,4);
        Silver silverMembership = new Silver ("Jassim","Alhatem","58456",3,6);
        PlatinumPlus platinumPlusMembership = new PlatinumPlus ("Jassim","Alhatem","58456",5,3,8);
        Invoice invoice = new Invoice ("4","Silver",6,2);

        // Printing the string

        System.out.println(platMembership.toString());
        System.out.println(goldMembership.toString());
        System.out.println(silverMembership.toString());
        System.out.println(platinumPlusMembership.toString());
        System.out.println(invoice.toString());

        System.out.println(platMembership.getPaymentAmount());
        System.out.println(goldMembership.getPaymentAmount());
        System.out.println(silverMembership.getPaymentAmount());
        System.out.println(platinumPlusMembership.getPaymentAmount());
        System.out.println(invoice.getPaymentAmount());


    }

}