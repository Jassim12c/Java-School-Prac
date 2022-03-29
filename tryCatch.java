import javax.annotation.processing.FilerException;
import javax.naming.NameNotFoundException;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.nio.file.FileAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // Throwing exception using Try Catch

        System.out.print("Please Enter your ID");
        try {
            int userId = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter an Integer");
        }

        // Throwing an exception using throw method

        System.out.print("Enter a random number");
        if(sc.hasNextInt()){
            int num = sc.nextInt();
        }else{
            throw new InputMismatchException();
        }

    }
}
