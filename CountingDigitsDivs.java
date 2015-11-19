package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingDigitsDivs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int T=in.nextInt();
		ArrayList<Long> input= new ArrayList<Long>();
		ArrayList<Long> output= new ArrayList<Long>();
		for(int i=0; i<T;i++)
			input.add(in.nextLong());
		
		for(Long i:input)
		{
			long count=0;
			long temp=i;
			while(temp>0)
			{
				int j=(int) (temp%10);
				if(j==0)
				{
					
				}
				else if(i%j==0)
				{
					count++;
				}
				
				temp=temp/10;
			}
			output.add(count);
		}
		for(long ou:output)
		System.out.println(ou);
	}

}
