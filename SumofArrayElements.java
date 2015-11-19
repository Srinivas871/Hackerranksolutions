package hackerrank;

import java.util.Scanner;

public class SumofArrayElements {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
            int values=in.nextInt();
            int val;
            long sum=0;
            //int valoo[10][10];
        for(int i=0;i<values;i++)
            {
            val=in.nextInt();
            sum=sum+val;
        }
        System.out.println("The sum of the elements in the array is "+sum);
    }
}
