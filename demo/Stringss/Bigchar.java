/**
 * 
 */
package Stringss;

/**
 * @author sai likhitha
 *
 */
public class Bigchar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a = "Helloo";
			String b = "World123abc";

			String big = a.length() > b.length() ? a : b;
			String small = a.length() < b.length() ? a : b;

			StringBuffer sb = new StringBuffer();

			for (int i = 0; i < small.length(); i++) {
				sb.append(a.charAt(i)).append(b.charAt(i));
			}
			
			sb.append(big.substring(small.length(), big.length()));
			
			System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
