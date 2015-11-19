package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int values=in.nextInt();
		float posifra=0.0f,negafra=0.0f,zerofra=0.0f;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<values;i++)
			al.add(in.nextInt());
		
		for(int i=0;i<values;i++)
		{
			if(al.get(i)>0)
				posifra++;
			else if(al.get(i)<0)
				negafra++;
			else
				zerofra++;
		}
		
		System.out.printf("%1.3f",posifra/values);
		System.out.printf("\n%1.3f",negafra/values);
		System.out.printf("\n%1.3f",zerofra/values);
	}

}
