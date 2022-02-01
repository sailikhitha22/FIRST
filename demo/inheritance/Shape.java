package inheritance;
class Shapes
{
	void draw() 
	{
		System.out.println("drawing shape");
	}
	void erase()
	{
		System.out.println("earsing shape");
	}
}
class Circles extends Shapes
{
	void draw()
	{
		System.out.println("drawing circle");
	}
	void erase()
	{
		System.out.println("earsing circle");
	}
}
class Triangle extends Shapes
{
	void draw()
	{
		System.out.println("drawing triangle");
	}
	void erase()
	{
		System.out.println("earsing triangle");
	}
}
class Square extends Shapes
{
	void draw()
	{
		System.out.println("drawing Square");
	}
	void erase()
	{
		System.out.println("earsing square");	
	}
}
public class Shape {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Shapes d=new Circles();
    d.draw();
    d.erase();
     Shapes t=new Triangle();
     t.draw();
     t.erase();
     Shapes s=new Square();
     s.draw();
     s.erase();
	}

}
