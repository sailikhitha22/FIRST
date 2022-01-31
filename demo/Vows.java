package kom.demo;

import java.util.Scanner;
class Ika
{
public void Msgd()
{
	Scanner sc = new Scanner(System.in);
	char s = sc.next().charAt(0);
	if(s== 'a' || s=='A' || s== 'e' ||s== 'E' || s== 'i' || s=='I' || s== 'o' || s=='O' || s=='u' ||s=='U')
	{
		System.out.println("Vowel");
	}
	else
	{
		System.out.println("Constant");
	}

}
}
public class Vows
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Ika p = new Ika();
       p.Msgd();
		}
}