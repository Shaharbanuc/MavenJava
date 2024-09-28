package abstraction;

public class NonAbstract extends AbstractExample{

	public static void main(String[] args) {
		
		AbstractExample.display();
		NonAbstract obj =new NonAbstract();
		obj.display1();
		obj.sample();
	}

	@Override
	public void sample() {
		System.out.println("method body");
	}

}
