import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.regex.*;

public class lab2 {
    public static void main(String[] args){
        try{
            // Question 1
            File inputFile = new File("input.txt");
            Scanner myReader = new Scanner(inputFile);

            FileWriter myWriter = new FileWriter("output.txt");
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                myWriter.write(data);
                myWriter.write(System.lineSeparator());
            }
            myReader.close();
            myWriter.close();

            // Question 2
            File empFile = new File("emp.txt");
            Scanner myEmps = new Scanner(empFile);

            FileWriter outputWriter = new FileWriter("output2.txt");

            int highestSal = 0;
            int lowestSal = 0;

            while(myEmps.hasNext()){
                String data = myEmps.next();

                try{
                    int intVal = Integer.parseInt(data);
                    if(intVal > highestSal){
                        highestSal = intVal;
                    }
                    if(lowestSal == 0){
                       lowestSal = intVal;
                    }else{
                        if(intVal < lowestSal){
                            lowestSal = intVal;
                        }
                    }
                }catch(NumberFormatException e){
                    continue;
                }

            }

            Scanner findFullLine = new Scanner(empFile);
            while(findFullLine.hasNextLine()){
                String highSalString = Integer.toString(highestSal);
                String loweSalString = Integer.toString(lowestSal);
                String data = findFullLine.nextLine();
                if(data.contains(highSalString) || data.contains(loweSalString)){
                    outputWriter.write(data);
                    outputWriter.write(System.lineSeparator());
                }
            }

            myEmps.close();
            outputWriter.close();
            findFullLine.close();

            // Question 3

            Scanner sc = new Scanner(System.in);
            System.out.println("Select the price range \n-Low\n-Average\n-High");
            String priceRangeAnswer = sc.nextLine();
            System.out.println("Select the season \n-Summer\n-Spring\n-Winter\n-Autumn");
            String seasonSelection = sc.nextLine();

            File dressFile = new File("DressDataSet.txt");
            Scanner dressScan = new Scanner(dressFile);

            while(dressScan.hasNextLine()){
                // Only get ID, Price, Rating and Season
                String data = dressScan.nextLine();
                if(data.contains(priceRangeAnswer) && data.contains(seasonSelection)){
                    System.out.println(data);
                }
            }


        }catch(FileNotFoundException err){
            System.out.println("The file you are looking for does not exist");
        } catch (IOException err) {
            System.out.println("An error has occurred");
            err.printStackTrace();
        }

    }


}
