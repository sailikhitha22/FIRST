package kom.demo;

import java.util.Scanner;

 class Additions {
 public void aff()
 {
	Scanner f = new Scanner(System.in);
	int c=f.nextInt();
	int d=f.nextInt();
	int o=c+d;
	System.out.println(o);
 }
}
public class Addition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Additions d = new Additions();
     d.aff();
	}

}
