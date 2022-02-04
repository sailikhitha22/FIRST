package Stringss;

import java.util.Scanner;

public class Longshort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner g= new Scanner(System.in);
			String s1 = g.next();
		
			String s2 = g.next();
			int n1 = s1.length();
			int n2 = s2.length();

		
		
		if(n2>n1)
		{
			
			
			
			System.out.println(s1+s2+s1);
		}
		else
		{
			System.out.println(s2+s1+s2);
		}
		
		
		
		
		
		
		
	}

}
