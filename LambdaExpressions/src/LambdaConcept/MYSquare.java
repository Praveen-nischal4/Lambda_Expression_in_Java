package LambdaConcept;

public class MYSquare {

	@FunctionalInterface
	interface Square
	{
		abstract void mySquare(double sd);
	}
	
	public void calculateMySquare(double sd,Square s)
	{
		s.mySquare(sd);
	}
	
	public static void main(String[] args) {
		
		MYSquare ms =new MYSquare();
		
		Square s = (sd) -> { System.out.println("Area OF Square ="+sd*sd); };
		ms.calculateMySquare(15, s);
	}

}
