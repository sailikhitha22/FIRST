package Static;
import java.util.Scanner;
class Demo
{
	Scanner c = new Scanner(System.in);
    int n= c.nextInt();	
 void sample()
	{
	 if(n==0)
	{
		System.out.println("its zero");
	}
	else if (n>0)
	{
		System.out.println("its positive");
	}
	else if(n<0)
	{
		System.out.println("its negetive");
	}
}	
}
public class Positive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Demo f = new Demo();
     f.sample();
	}

}

