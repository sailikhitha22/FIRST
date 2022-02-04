package Stringss;

import java.util.Scanner;

public class Wiii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner g= new Scanner(System.in);
			String str = g.next();
		
		int n = str.length();
		
		String repeater = "";
		
		if (n < 2) repeater = str;
		else repeater = str.substring(0, 2);
		
		String output = "";
		
		for (int i = 0; i < n; i++) {
			output += repeater;
		}
		
		System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
