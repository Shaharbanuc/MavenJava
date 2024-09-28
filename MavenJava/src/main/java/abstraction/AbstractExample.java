package abstraction;

public abstract class AbstractExample {

	public AbstractExample()
	{
		System.out.println("Hi,I am constructor");
	}
	public abstract void sample();
	
	public static void display()
	{
		System.out.println("static method");
	}
	public void display1()
	{
	System.out.println("instance method");
	}
}
