package Stringss;

import java.util.Scanner;

class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner g= new Scanner(System.in);
		String str = g.next();
	
	int n = str.length();
	
		System.out.println(n);
		
	

		if (str.charAt(0) == 'x')
			str = str.substring(1, str.length());
		
		if (str.charAt(str.length() - 1) == 'x')
			str = str.substring(0, str.length() - 1);
		
		System.out.println(str);

		
		
		
		
	}

}
