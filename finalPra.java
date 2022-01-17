public class finalPra {
    public static void main(String[] args){
        double dblTotal = 3.43453453;
        String name = "jassim";
        System.out.printf("Total is: $%,.3f%n", dblTotal);
        System.out.printf("My name is %s", name);

        int day = 8;
        switch (day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("That's not a day");
        }

        int grade = 60;
        if(grade >= 90 ){
            System.out.println("A");
        }else if(grade >= 80){
            System.out.println("B");
        }else if (grade <= 50){
            System.out.println("Fail");
        }else{
            System.out.println("Not a grade");
        }

        int Salaray1 = 100;
        int Salaray2 = 200;
        System.out.println(1443/100);
        System.out.println(Salaray1 > Salaray2 ? "Salary1 is Richer" : "Salary2 is Richer");


        for(int i = 1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("X");

            }

            System.out.println();

        }
        System.out.println();
        for( int i=1; i<=6; i++ ){
            for( int j=1; j<=6; j++ ){
                if( i<=3 && j<=3 || i>=4 && j>=4 )
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        int count = 0;
        while(true){
            System.out.println("jassim");
            count++;
            if (count >=10){
                break;
            }
        }

        System.out.println(intTotal(5, 10));
        System.out.println(strip("hello my name is jasim \n l2f2f"));
        System.out.println(boxIt("MONEY",'#'));

        char character = 'A';

        System.out.println(Character.isUpperCase(character));
        String[] poem = { "To be or not to be" , "that is the question" ,

                "whether tis nobler in the mind", "to suffer the slings and arrows",

                "of outragious fortune", "or to take arms against a sea of troubles",

                "and by opposing end them" };
        int line = 1;
        for(String s : poem){
            System.out.println(line + ". " + s);
            line++;
        }
    }
    public static int intTotal(int num1, int num2){
        return num1 + num2;
    }

    public static String strip(String text){

        String ans = "";

        for( int i=0; i<text.length() ; i++ ){

            char letter = text.charAt(i);

            if( !Character.isWhitespace(letter) )

                ans += letter;

        }

        return ans;

    }

    public static boolean boxIt(String text, char symbol){
        for( int i=1; i<=text.length()+2; i++ ){
            System.out.print(symbol);
        }
        System.out.println();
        System.out.println( symbol + text + symbol );
        for( int i=1; i<=text.length()+2; i++ ){
            System.out.print(symbol);
        }
        System.out.println();
        return false;
    }


}
