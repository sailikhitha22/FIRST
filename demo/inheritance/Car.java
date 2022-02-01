package inheritance;
   abstract class Cars
   {  
	  abstract void run();
	}  
	class Honda4 extends Cars
	{  
	void run()
	{
		System.out.println("running safely");
	} 
	}
	public class Car
	{
	public static void main(String args[])
	{  
	 Cars obj = new Honda4();  
	 obj.run();  
	}
	}
		  