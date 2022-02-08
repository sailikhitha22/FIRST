package Collections;

import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		

		Vector<String> v = new Vector<String>();
		v.add("hi");
		v.add("hey");
		
		System.out.println("element are:" +v);
		System.out.println("something:"+v.capacity());
		
		
	}

}
