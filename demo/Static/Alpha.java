package Static;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("if first char is " );
		char p = a.next().charAt(0);
		System.out.println("if second is " );
		char q = a.next().charAt(0);
		System.out.println("if first char is " +p +" and second is " +q);
		if(p>q)
		{
			System.out.println("first is " +q +" and second is " +p);
		}
		else if(p<q)
		{
			System.out.println("invalid");
		}
	}

}
