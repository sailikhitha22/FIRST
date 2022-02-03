package Static;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c = new Scanner(System.in);
	   int u= c.nextInt();	
		int o = u /2;
		if(u==o*2)
		{
			System.out.println("its not a prime");
		}
		else if (u!= o*2)	
		{
			System.out.println("its a prime");	
		}
		
	}

}
