package Static;

import java.util.Scanner;

public class Month {
		public static void main(String[] args) { 
			Scanner cd = new Scanner(System.in);
			int r = cd.nextInt();
			if (r > 12)
		    	System.out.println("INVALID");  
			else if (r<=12) {
				    switch(r){  
				    case 1:
				    	System.out.println("JANUARY");  
				    break;  
				    case 2:
				    	System.out.println("FEBRUARY");  
				    break;  
				    case 3:
				    	System.out.println("MARCH");  
				    break;  
				    case 4:
				    	System.out.println("APRIL");  
				    break;  
				    case 5:
				    	System.out.println("MAY");  
				    break; 
				    case 6: 
				    	System.out.println("JUNE");  
				    break;  
				    case 7: 
				    	System.out.println("JULY");  
				    break;  
				    case 8: 
				    	System.out.println("AUG");  
				    break;  
				    case 9: 
				    	System.out.println("SEP");  
				    break;  
				    case 10: 
				    	System.out.println("OCT");  
				    break;  
				    case 11: 
				    	System.out.println("NOV");  
				    break;  
				    case 12: 
				    	System.out.println("DEC");  
				    break; 
				    
				    
				    default:
				    	System.out.println("ENTER A NUMBER");  
				    }  
				}  
				  
		}
}

