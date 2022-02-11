package InputOutput;
import java.io.*;
import java.util.*;
public class Construct
{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String filename = sc.nextLine();
		System.out.println("Enter character");
		char count = sc.nextLine().charAt(0);
		File file = new File(filename);
		BufferedReader b = new BufferedReader(new FileReader(file));
		int t = 0;
		int	ch =0;
		do {
		  	ch = b.read();
			if (ch >= 65 && ch <= 90) ch += 32;
			if (count >= 65 && count <= 90) 
				count += 32;
			if (ch == count)
				t++;
		}
		while (ch != -1);		
		System.out.println(t + " times of '" +count + "'.");
		
		
	}

}