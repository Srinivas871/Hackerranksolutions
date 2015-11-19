package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		ArrayList<Boolean> al=new ArrayList<Boolean>();
		for(int i=0;i<t;i++)
		{
			int n=in.nextInt();
			int k=in.nextInt();
			int count=0;
			for(int j=0;j<n;j++)
				if(in.nextInt()<=0)
					count++;
			if(count>=k)
				al.add(true);
			else
				al.add(false);
		}
		for(boolean b:al)
			if(b==true)
				System.out.println("NO");
			else
				System.out.println("YES");
	}

}
