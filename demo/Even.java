package com.demo;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner f = new Scanner(System.in);
		int c=f.nextInt();
		if(c%2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}


	}

}
