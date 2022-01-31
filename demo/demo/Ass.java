package kom.demo;

import java.util.Scanner;
class IK 
{
public void Msg()
{
	Scanner sc = new Scanner(System.in);
	char s = sc.next().charAt(0);
	int v = (int)s;
	System.out.println(v);

}
}
public class Ass 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       IK p = new IK();
       p.Msg();
		}
}