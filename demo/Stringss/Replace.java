package Stringss;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		
String s1 = r.next();
String s2 = r.next();
int y  = s1.length();
int q = s2.length();
int e = y-1;
int f = q-1;
if(s1.charAt(e) == s2.charAt(0))
{
	StringBuffer sb = new StringBuffer();
	sb.append(s1);
 sb.append(s2.substring(1,q));
 System.out.println(sb);		
	}
else
{
String d = s1+s2;
System.out.println(d);

}
}
}
