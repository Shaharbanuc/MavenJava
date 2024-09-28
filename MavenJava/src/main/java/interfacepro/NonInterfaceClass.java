package interfacepro;

public class NonInterfaceClass implements InterfaceExample1,InterfaceExample2{

	public static void main(String[] args) 
	{
		NonInterfaceClass obj = new NonInterfaceClass();
		obj.sample();
		obj.display();
	}

	@Override
	public void sample() {
		System.out.println(a+b);
	}

	@Override
	public void display() {
		System.out.println(c);
		
	}

}
