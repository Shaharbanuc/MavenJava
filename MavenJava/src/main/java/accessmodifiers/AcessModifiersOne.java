package accessmodifiers;

public class AcessModifiersOne {

	public void pub()
	{
		System.out.println("public method");
	}
	private void pri()
	{
		System.out.println("Private method");
	}
	protected void prot()
	{
		System.out.println("Protected method");
	}
	void def()
	{
		System.out.println("Default method");
	}

	public static void main(String[] args) 
	{
		AcessModifiersOne obj=new AcessModifiersOne();
		obj.pub();
		obj.pri();
		obj.prot();
		obj.def();
	}


}
