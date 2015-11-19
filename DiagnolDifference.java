package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagnolDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
        
        int values=in.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        //Unable to create an array like int ar[10][10];
        long sum=0;
        int maindiag=0,otherdiag=0,ind=0;
        for(int i=0;i<values*values;i++)
        al.add(in.nextInt());
        
        while(ind<values*values)
        {
        	maindiag=maindiag+al.get(ind);
        	ind=ind+values+1;
        }
        
        ind=values*(values-1);
        while(ind>0)
        {
        	otherdiag=otherdiag+al.get(ind);
        	ind=ind-(values-1);
        }
        
        
        System.out.println(Math.abs(maindiag-otherdiag));
	}

}
