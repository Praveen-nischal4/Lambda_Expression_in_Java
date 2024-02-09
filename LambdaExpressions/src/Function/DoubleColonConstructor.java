// how to refer to the constructor of functional interface using lambda expression and dobule colon function.

package Function;

class Sample
{
	private String x;      //instance variable
	
	Sample(String x)           //constructor of sample class
	{
		this.x =x;
		System.out.println("Constructor excecuted "+x);
	}
}

interface MyInter
{
	Sample get(String str);             //function interface with get() to return object of sample class
}


public class DoubleColonConstructor {

	public static void main(String[] args) {
		
		MyInter mi = (String x) -> { return new Sample(x);};
		
		Sample s = mi.get("From lambda Expression");
		
		MyInter mi1 = Sample ::new;
	 Sample s1 = mi1.get("From double colon function");			

	}

}
