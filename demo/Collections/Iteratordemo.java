package Collections;
import java.util.*;
public class Iteratordemo {

	public static void main(String[] args) {
		
		

ArrayList<String> t = new ArrayList<String>();	

t.add("Likhi");
t.add("tha");
Iterator iter = t.iterator();
while(iter.hasNext())
{
System.out.println(iter.next());
}


	}

}
