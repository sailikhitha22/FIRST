package Collections;
import java.util.*;
public class Eight {
private Vector<Integer> s = new Vector<Integer>();
	public Vector<Integer> saveEvenNumbers(int N) {
		s = new Vector<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0)
			s.add(i);
			//System.out.println(i);
		}
		return s;
	}

	public List<Integer> printEvenNumbers() {
		Vector<Integer> n = new  Vector<Integer>();
		
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