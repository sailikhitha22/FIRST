package Static;

import java.util.Scanner;

public class Switchh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		Scanner vc = new Scanner(System.in);
		char colour = vc.next().charAt(0);
			    switch(colour){  
			    
			    case 'R':
			    	System.out.println("RED");  
			    break;  
			    case 'B':
			    	System.out.println("BLUE");  
			    break;  
			    case 'G':
			    	System.out.println("GREEN");  
			    break;  
			    case 'O':
			    	System.out.println("ORANGE");  
			    break;  
			    case 'Y':
			    	System.out.println("YELLOW");  
			    break; 
			    case 'W': 
			    	System.out.println("WHITE");  
			    break;  
			    default:
			    	System.out.println("INVALID");  
			    }  
			}  
			  
	}

