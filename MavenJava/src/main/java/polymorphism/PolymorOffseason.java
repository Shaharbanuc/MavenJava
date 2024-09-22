package polymorphism;

public class PolymorOffseason {
	
	float total;
	float rate=2500.00f;
	String season="offseason";
	
	public void discount()
	{
		total=rate-(rate*0.15f);
		System.out.println("The bill amount in Offseason is "+total);
	}

}
