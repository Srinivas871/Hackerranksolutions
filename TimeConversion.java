package hackerrank;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		Integer hh=Integer.parseInt(s.substring(0,2));
		if(s.substring(8,10).equals("PM")&&hh<12)
			hh=hh+12;
		else if(s.substring(8,10).equals("AM")&&hh==12)
			hh=00;
		
		String newtime="";
		if(hh<10)
		{
			newtime="0";
		newtime= newtime.concat(hh.toString());
		}
		else
		newtime=hh.toString();
		
		newtime=newtime.concat(s.substring(2,8));
		System.out.println(newtime);
	}

}
