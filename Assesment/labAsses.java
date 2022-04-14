package Assesment;

public class labAsses {
    public static void main(String[] args){
        Retail customer1 = new Retail(
                "123",
                "Jassim",
                "96024797",
                "Qadisya",
                43.5,
                4,
                32.1,
                1.2);

        Wholesale customer2 = new Wholesale(
                "421",
                "3ly",
                "32312432",
                "Salm,",
                23.5,
                10,
                3.2
        );

        System.out.println(customer1.revenue() + "\n" + customer1.toString());
        System.out.println();
        System.out.println(customer2.revenue() + "\n" + customer2.toString());
    }
}
