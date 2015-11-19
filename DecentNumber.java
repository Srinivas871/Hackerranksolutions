package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class DecentNumber {

	public static void main(String[] args){
		 
		 Scanner in=new Scanner(System.in);
		 int t=in.nextInt();
		 ArrayList<String> al = new ArrayList<String>();
		 for(int i=0;i<t;i++)
		{
		 int div3=0,div5=0;	 
		 int n=in.nextInt();
		 if((n%3)==0)
		 div3=n;
		 else if (n==5 || n==10) // first two multiples are special cases
			 div5=n/5;
		 else
		 {
		  while(n>=3)
		  {
		    div5++;
		    n=n-5;
		    div3=n;
		    if(n%3==0)
			break;
		   }
		  }
		 
		 div5=div5*5;
		 if(n<3)
		  al.add("-1");
		 else
		 {
		  StringBuffer num=new StringBuffer();
		  for(int j=0;j<div3;j++)
		  {
		  num.append("5");
		  }
		  
		  for(int j=0;j<div5;j++)
		  {
		  num.append("3");
		  }  
		  al.add(num.toString());
		 }
    }
		 for(String s:al)
		 System.out.println(s);
	}
}
	