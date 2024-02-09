package LambdaConcept;

@FunctionalInterface
interface Greeting
{
	abstract void Message();
}


public class Welcome {

	public static void main(String[] args) {
		
		Greeting g = () -> { System.out.println("Hello! How are you "); };
		
		g.Message();
	}

}
