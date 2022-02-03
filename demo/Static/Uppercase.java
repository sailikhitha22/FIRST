package Static;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char q = sc.next().charAt(0);
		char b;
		char s;
		if(Character.isLowerCase(q))
		{
			b=Character.toUpperCase(q);
			
			System.out.println("old one is:"+q);
			System.out.println("new one is:"+b);
		}
		else 
		{
			s=Character.toLowerCase(q);
			System.out.println("old one is:"+q);
			System.out.println("new one is:"+s);
			
		}
		
		
		
		
		
		
		
	}

}
