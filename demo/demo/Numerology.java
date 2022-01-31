package kom.demo;

import java.util.Scanner;
   	
public class Numerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=0 , o=0, r, k, sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = s.nextInt();
		int temp=x;
		while(temp>0) {
			r=temp%10;
			sum+=r;
			if(r%2==0) {
				e++;
				}
			else {
				o++;
			}
			temp/=10;
		}
		
		k= sum;
		Numerology no = new Numerology();
		while(k>9)
		{
			k = no.play(k);
		}
		
		System.out.println("Sum of digits:" + sum);
		System.out.println("Numerology number:\n" +k);
		System.out.println("Number of even numbers:\n" +e);
		System.out.println("Number of odd numbers:\n" +o);
		}
	int play(int k) {
		int s=0,r, temp=k;
		while(temp>0) {
			r=temp%10;
			s+=r;
			temp/=10;
		}
		return s;
	}
}