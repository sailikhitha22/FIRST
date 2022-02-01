package inheritance;
class Fruits
{
	String name="papaya";
	String taste="pulpy";
	int size= 9;
	void eat()
	{
		System.out.println("name is:"+name);
		System.out.println("taste is:"+taste);
		System.out.println("size is:"+size);
	}
}
class Apple extends Fruits
{
	void eat()
	{
		System.out.println("apple is sweet");
	}
}
class Orange extends Fruits
{
	void eat()
	{
		System.out.println("orange is sour");
	}
}
public class Fruit
{
public static void main(String args[])
{
	Fruits d = new Fruits();
	d.eat();
Fruits f=new Apple();
f.eat();
Fruits g=new Orange();
g.eat();
}
}
