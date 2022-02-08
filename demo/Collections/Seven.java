package Collections;
import java.util.*;
public class Seven {
private LinkedList<Integer> s = new LinkedList<Integer>();
	public LinkedList<Integer> saveEvenNumbers(int N) {
		s = new LinkedList<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0)
			s.add(i);
			//System.out.println(i);
		}
		return s;
	}

	public List<Integer> printEvenNumbers() {
		 LinkedList<Integer> n = new  LinkedList<Integer>();
		
		for (int item :s) {
			n.add(item * 2);
			System.out.println(item * 2);
			}
		return n;
	}
 public static void main(String[] args) {
		One g = new One();
		g.saveEvenNumbers(10);
		g.printEvenNumbers();
	}

}	