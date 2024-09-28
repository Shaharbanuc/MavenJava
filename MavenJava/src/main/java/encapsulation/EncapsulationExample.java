package encapsulation;

public class EncapsulationExample {
	
	private int a,b;
	
	public void setter(int a, int b)
	{
		this.a=a;
		this.b=b;	
	}
	public void getter()
	{
		System.out.println("value of a & b is "+a+" "+b);
	}

}
