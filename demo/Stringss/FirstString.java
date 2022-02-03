package Stringss;

import java.util.Scanner;

public class FirstString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s = "hisailikhitha";
   String s1 = "i";
   Scanner d = new Scanner(System.in);
   System.out.println("input no:");
   int a = d.nextInt();
   char x=s.charAt(a);
  System.out.println("char at index is:"+x);
 // char p[]=new char[10];
  
  System.out.println("compared:"+s.compareTo(s1));
  System.out.println("concated:"+s.concat(s1));
  System.out.println("cont:"+s.contains(s1));
  System.out.println("ends:"+s.endsWith(s1));
  System.out.println("equal:"+s.equals(s1));
  System.out.println("eqig:"+s.equalsIgnoreCase(s1));
  System.out.println("format:"+String.format("%d",567));
  //System.out.println("byte:"+s1.getBytes(s));
  System.out.println("index:"+s.indexOf(s));
 // System.out.println("char:"+s.getChars(0,12,p,0)));
  System.out.println("replaceall:"+s.replaceAll("i","o"));
  System.out.println("replace:"+s.replace('l', 'd'));
  System.out.println("empty:"+s.isEmpty());
  System.out.println("split:"+s.split(s1));
  System.out.println("sub:"+s.substring(2,3));
  System.out.println("low:"+s.toLowerCase());
  System.out.println("upp:"+s.toUpperCase());
  System.out.println("trim:"+s.trim());
  System.out.println("value:"+String.valueOf(s1));
  System.out.println("length:"+s.length());
  String h = String.join("hi","likhi "," sunny ");
  System.out.println("join:"+h);
  System.out.println("lastind "+s.lastIndexOf('a'));
  
	}

}
