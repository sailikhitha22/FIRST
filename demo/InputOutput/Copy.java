package InputOutput;
import java.util.*;
import java.io.*;
public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] array = new byte[50];
	    try {
	      FileInputStream sourceFile = new FileInputStream("input.txt");
	      FileOutputStream destFile = new FileOutputStream("newFile");

	      sourceFile.read(array);

	      destFile.write(array);
	      System.out.println("The input.txt file is copied to newFile.");

	  
	      sourceFile.close();
	      destFile.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	}
}

 
