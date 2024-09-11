package aggregation;

public class ChildClass {
	ParentClass reference;
	String str;
	public ChildClass(String str,ParentClass reference)
	{
		this.str=str;
		this.reference=reference;
	}
	public void display()
	{
		System.out.println(str);
		System.out.println(reference.a+"  "+reference.b);
	}

	public static void main(String[] args) {
		
		ParentClass obj=new ParentClass(10,20);
		ChildClass obj1=new ChildClass("hii",obj);
		obj1.display();

	}

}
