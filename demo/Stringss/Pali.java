package Stringss;

import java.util.Scanner;

public class Pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner n= new Scanner(System.in);
		String g = n.next();
		int l = g.length();
		int cout=0;
		int i = 0;
		for( i = 0;i<l/2;i++)
		{
		 	
			if(g.charAt(i)==g.charAt(l-i-1))
			{
				cout++;
				
			}
		}
			if(cout==i)
			{
				System.out.println("ITS PALINDROME");	
			}
			else
			{
				System.out.println("not PALINDROME");
			}
	
		}
	}
