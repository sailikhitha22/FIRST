package Stringss;

import java.util.Scanner;

public class Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner g= new Scanner(System.in);
			String str = g.next();
		
		int l = str.length();
		System.out.println(l);
		
		
		
		System.out.println(str.substring(1,l-1));
		
	}

}
