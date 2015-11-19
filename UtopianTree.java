package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> input= new ArrayList<Integer>();
		ArrayList<Integer> output= new ArrayList<Integer>();
		Integer T=in.nextInt();
		int items=0;
		while(items<T)
		{
			items++;
			input.add(in.nextInt());
		}
		for(int i:input)
		{
			int height=1;
			if(i==0)
			{
				//do nothing
			}
			else
			for(int j=1;j<=i;j++)
			{	
			if(j%2==0)
			 height=height+1;
			else
				height=2*height;
			}	
			output.add(height);
		}
		for(int out:output)
		System.out.println(out);
	}

}
