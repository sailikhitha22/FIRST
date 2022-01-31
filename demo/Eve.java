package kom.demo;

import java.util.Scanner;
class Oat
{
public void Psg()
{
	Scanner f = new Scanner(System.in);
	int c=f.nextInt();
	if(c%2 == 0)
	{
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}

}
}
public class Eve
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Oat l = new Oat();
       l.Psg();
		}
}