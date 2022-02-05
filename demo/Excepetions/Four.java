package Excepetions;
import java.util.*;
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner c = new Scanner(System.in);
		
		int a = c.nextInt();
		int b = c.nextInt();
		
		try {
			double r = division(a, b);
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		c.close();
	}
	
	public static double division(int a, int b) throws ArithmeticException {
		return a / b;
		
		
		
		
		
		
		
		
	}

}
