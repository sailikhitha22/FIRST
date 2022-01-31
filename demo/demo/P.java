package kom.demo;

public class P {
 String name;
 double w;
 double h;
 double Bmi( ) {
	double r = (w/(h*h))*703;
	return r;
	 
 }
 class ps
 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    P.k=new P();
    double x=k.Bmi(70,80);
     System.out.println("op:"+x);
	}
 }
}
