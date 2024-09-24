package finalkeyword;

//extends FinalMethodExmp ->can't extend final class
public class FinalExample
{
	final int a=10;
	
	//can not change the value of a
	/*public FinalExample()
	 {
		 a=20;
	 }*/
	
	//final method-cannot override
/*public final  void sample()
{
	System.out.println("main method");
}
*/

	public static void main(String[] args) {
		
		FinalExample obj=new FinalExample();
		System.out.println(obj.a);
		
		//obj.sample();
	}

}
