package Stringss;

import java.util.Scanner;

public class Catdog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner n= new Scanner(System.in);
			String g = n.next();
		
		String output;
		int l = g.length();
		if (l % 2 == 0)
		{
			output = g.substring(0, l / 2);
		} 
		
		else 
		{
			output = null;
		}
		
		System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
