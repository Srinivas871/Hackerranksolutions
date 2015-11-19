package hackerrank;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int a=1;a<=i-1;a++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-(i-1);j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
