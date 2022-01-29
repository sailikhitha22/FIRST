package com.demo;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner f = new Scanner(System.in);
		int c=f.nextInt();
		int d=f.nextInt();
		int x=c;
		c=d;
		d=x;
		
		System.out.println(c);
		System.out.println(d);
	}

}
