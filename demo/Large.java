package com.demo;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner f = new Scanner(System.in);
		int a=f.nextInt();
		int b=f.nextInt();
		int c=f.nextInt();
		 if(a>b && a>c)
		 {
			 System.out.println("A IS LARGE");
		 }
		 else if (b>a && b>c)
		 {
			 System.out.println("b IS LARGE");
		 }
		
		 else if(c>a && c>b)
		 {
			 System.out.println("c IS LARGE"); 
			 
		 }
	}

}
