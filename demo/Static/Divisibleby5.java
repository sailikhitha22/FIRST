package Static;

public class Divisibleby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=0;
  int count = 0;
 for(n=0;count<=5;n++)
 {
	 
  while(n%2==0 && n%3==0 && n%5==0)
	  {
	  		System.out.println("number is:"+n);	  		
	  		 n=n+1;
	  		count = count + 1;  
	  }
  
 }
  
  
  }
	}

