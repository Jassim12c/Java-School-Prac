package Assesment;

import java.io.*;
import java.util.Scanner;

public class filesio {
    public static void main(String[] args){
        try {
            File input = new File("textFiles/ali.txt");
            Scanner inputScan = new Scanner(input);
            FileWriter out = new FileWriter("textFiles/jas.txt");
            out.write("hello");
            out.close();
            inputScan.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("IO error detected");
        }
        finally{
            System.out.println("3li is gay");
        }

        int[][] lst = new int[5][5];
        for(int i = 0; i<=lst.length-1; i++){ // i => rows
            for(int j=0; j<= lst[i].length-1; j++){ // j => columns

            }
        }
    }
}
