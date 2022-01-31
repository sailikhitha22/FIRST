package kom.demo;

import java.util.Scanner;

public class Banking {
     void Method()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your acc no:");
	long A=s.nextLong();
	System.out.println("Intial Balance:");
	long I=s.nextLong();
	System.out.println("Deposit:");
	long D=s.nextLong();

	long B=I+D;
	System.out.println("Available Balance is :"+B );
	System.out.println("Withdraw amount:");
	long W=s.nextLong();
	if(W>B)
	{
		System.out.println("Insufficient Balance");
	}
	else 
	{
		long Q=B-W;
		System.out.println("Available Balance is :"+Q );
	}
}
public static void main(String args[])
{
	Banking j=new Banking ();
	j.Method();
}
}
