// Passing lambda expression as an argument to method  means
// passing functional interface reference to an argument to method is equivalent

package LambdaConcept;

public class Demoo {
	
	@FunctionalInterface
	interface Circle
	{
		abstract void calculate(double r);
	}

	void  CircleArea(double r ,Circle ref)
	{
		ref.calculate(r);
	}

	public static void main(String[] args) {
 
		Demoo dd = new Demoo();
		Circle ref = (r) -> { System.out.println("Area ="+ Math.PI *r*r); };
     dd.CircleArea(20, ref);
	}

}
