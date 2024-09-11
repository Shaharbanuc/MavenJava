package polymorphism;

public class ChildClassPoly extends ParentClassPoly{
	public void sample()
	{
		super.sample();
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassPoly obj=new ChildClassPoly();
		obj.sample();
	}

}
