package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int T=in.nextInt();
		ArrayList<Integer> input=new ArrayList<Integer>();
		ArrayList<Integer> output=new ArrayList<Integer>();
		
		ArrayList<Integer> tc=new ArrayList<Integer>();
		
		for(int i=0;i<N;i++)
			input.add(in.nextInt());
		
		for(int i=0;i<2*T;i++)
			tc.add(in.nextInt());
		
		int ind=0;
		while(ind<tc.size())
		{
			int i=0,j=0;
			i=tc.get(ind);
			j=tc.get(ind+1);
			int min=input.get(i);
			while(i<j)
			{
			 i++;
			 if(min>input.get(i))
				 min=input.get(i);
			}
			output.add(min);
			ind+=2;
		}
		for(int ou: output)
		System.out.println(ou);
	}

}
