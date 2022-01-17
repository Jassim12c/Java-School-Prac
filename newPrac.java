import java.util.ArrayList;
import java.util.Arrays;

public class newPrac {
    public static void main(String[] args){
        System.out.println(Arrays.toString(filler(20)));
        for (int elem : filler(5)){
            System.out.println(elem);
        }

        for(int i=10;  i<=90;  i+=5){
            System.out.println(i);
        }

    }
    public static int[]  filler( int size){
        int[] answer = new int[ size ];

        int count = 1;
        for( int i=0; i<answer.length; i++){
            answer[i] = count;
            count++;
        }
        return answer ;
    }
}
