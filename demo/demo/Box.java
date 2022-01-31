package kom.demo;

public class Box {
	double Volume (double width,double height,double depth)
	{
		double V=width*height*depth;
		return V;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Box c = new Box();
      System.out.println("volume is:"+c.Volume(20,5,10));
	}

}
