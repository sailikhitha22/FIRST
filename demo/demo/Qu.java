package kom.demo;

import java.util.Scanner;
class Su
{
public void Ki()
{
	Scanner f = new Scanner(System.in);
	int c=f.nextInt();
	int d=f.nextInt();
	int x=c/d;
	int h=c%d;
	System.out.println(x);
	System.out.println(h);
}
}
public class Qu 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Su f = new Su();
       f.Ki();
		}
}