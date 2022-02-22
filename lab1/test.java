package lab1;

import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String msg = "hi at Hello my name is jassim";
        Scanner sc = new Scanner(System.in); // Get user input
        char msg_char = msg.charAt(1);
        int msg_length = msg.length();
        int msg_index = msg.indexOf(" ");
        int msg_index2 = msg.indexOf("a", 10);
        int msg_lastIndex = msg.lastIndexOf("a"); // gets index position from the last letter
        String msg_upper = msg.toUpperCase();
        String msg_sub = msg.substring(0, 2);
        String myName = sc.nextLine(); // Print user input
        System.out.printf("%s", msg_index2);
        System.out.println("He said: \"My name is Jassim\""); // prints quotation
        String st1 = "Aello";
        String st2 = "Fello";
        System.out.println(st2.compareTo(st1));
        String greet = "Hello how are you";
        System.out.println(greet.replace("you", "Jassim"));

        // Math
        double power_of_two = Math.pow(2, 2);
        double max_num = Math.max(10,50); // min to get the least number
        double square_root = Math.sqrt(100);
        double pie = Math.PI;
        System.out.println((int)power_of_two);
        int x = 5;
        int y = 10;
        double ans = (Math.sqrt(Math.pow(Math.PI, Math.abs(x)))) / ( x + y ); // Quiz question
        double ans2 = Math.pow(Math.PI, x) / (x + y) + Math.sqrt(Math.abs(x)); // Quiz question 2
    }
}