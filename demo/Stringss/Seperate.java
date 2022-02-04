package Stringss;

import java.util.Scanner;

public class Seperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner g= new Scanner(System.in);
			String s1 = g.next();
		
			String s2 = g.next();
			 Scanner f= new Scanner(System.in);
		int x = f.nextInt();
		
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0;i<x;i++)
		{
			
	    sb.append(s1).append(s2);
		
      
	}
	
		System.out.println(sb);
		
		
		
		
	}

}
