package Static;
class LoopDemo {
 void show() {
		// for loop demo
		for (int i = 0; i < 9; i++) 
		{
      System.out.println("numners" + i);
		}
  // while loop demo
		int i = 0;
  while (i < 9) {
          i++;
		  System.out.println("numners" + i);
		}
// do while loop
// while loop demo
    int k=0;
		do {
		    k++;
			System.out.println("numners" + k);
		} while(k < 9);

	}}
public class Loop {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	LoopDemo s = new LoopDemo();
	s.show();
System.out.println("hi");
	}

}