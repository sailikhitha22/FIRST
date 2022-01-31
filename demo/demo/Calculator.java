package kom.demo;
//import java.util.*;
 class Calculatora {
	 static double Powerint(int num1,int num2)
	 {
		  double h = Math.pow( num1, num2);
		 return h;
	 }
	
	static double Powerdouble(double num1,int num2)
	{
		
		double u = Math.pow( num1, num2);
		return u;
	}
}
 class Calculator
{
	public static void main(String[] args) 
	{
		 System.out.println(+Calculatora.Powerint(2,2));
		 
		System.out.println(+Calculatora.Powerdouble(2,5));
	}
}
