package polymorphism;

import java.util.Scanner;
//program on polymorphism ,same method discount in two classes.
public class PolymorOnseason extends PolymorOffseason{
	
	float total;
	float rate=2500.00f;
	String season="onseason";
	int i;
	
	public void discount()
	{
		if(i==1)
		{
		total=rate-(rate*0.401f);
		System.out.println("The bill amount is "+total);
		}
		else if(i==2)
		{
			super.discount();
		}
		else
		{
			System.out.println("invalid entry");
		}
	}

	public static void main(String[] args) {
		PolymorOnseason obj=new PolymorOnseason();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for onseason and 2 for offseason");
		obj.i=sc.nextInt();
		obj.discount();

	}

}
