package Stringss;

import java.util.Scanner;

public class Bigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner g= new Scanner(System.in);
			String s1 = g.next();
		
			String s2 = g.next();
	
			 
				int x =s1.length();
				int y =s2.length();
	
				String big = x> y ? s1 : s2;
				String small = x < y ? s1 : s2;

				StringBuffer sb = new StringBuffer();

				for (int i = 0; i < small.length(); i++) {
					sb.append(s1.charAt(i)).append(s2.charAt(i));
				}
				
				sb.append(big.substring(small.length(), big.length()));
				
				System.out.println(sb);
				
				
				
				
				
	
	
	
	
	
	}

}
