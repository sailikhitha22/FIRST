package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> t = new ArrayList<String>();	
		
		t.add("Likhi");
		t.add("chikki");	
		t.add("pikki");
		t.add("yikki");
		
		Iterator i = t.iterator();
		
		int p = 0;
		
		while(p<2)
		{
			System.out.println(i.next());
			p++;
		}
		
		
	}
	
	
	

}
