package kom.demo;

import java.util.Scanner;
class Opp
{
public void Msg()
{
	Scanner f = new Scanner(System.in);
	int c=f.nextInt();
	int d=f.nextInt();
	int x=c;
	c=d;
	d=x;
	
	System.out.println(c);
	System.out.println(d);

}
}
public class Swpping
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Opp p = new Opp();
       p.Msg();
		}
}