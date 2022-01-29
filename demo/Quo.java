package com.demo;

import java.util.Scanner;

public class Quo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner f = new Scanner(System.in);
		int c=f.nextInt();
		int d=f.nextInt();
		int x=c/d;
		int h=c%d;
		System.out.println(x);
		System.out.println(h);
	}

}
