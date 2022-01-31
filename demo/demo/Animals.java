package kom.demo;

 class Animals 
{
void eat()
{
	System.out.println("yes1");
}
void sleep()
{
	System.out.println("no1");
}
class Bird extends Animals
{
	void eat()
	{
		System.out.println("yes2");
	}
	void sleep()
	{
	System.out.println("no2");
	
	}
  void fly()
  {
	  System.out.println("noTHING");
  }
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animals d = new Animals();
       d.eat();
       d.sleep();
       Bird e = d.new Bird();
       e.eat();
       e.sleep();
       e.fly();
  	}
	

}
