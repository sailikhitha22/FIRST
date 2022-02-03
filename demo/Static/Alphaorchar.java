package Static;

import java.util.Scanner;

public class Alphaorchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char f = sc.next().charAt(0);
		
		if(f>=48 && f<=57)
		{
			System.out.println("its a number");
		}
		else if((f>='a' && f<='z')|| (f>='A' && f<='Z') )
		{
			System.out.println("its a character");
		}
		else
		{
			System.out.println("its a special character");
		}

	}

}
