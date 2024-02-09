//passing Lambda Expression as argument to method
//This is a concise way to define and use functional interfaces 
//(interfaces with only one abstract method) without needing to create a separate class
//implementing that interface


package Basic;

interface Shapes
{
	abstract void Area(double length,double breadth);
}

public class Revision2 {

	public void CalculateArea(double length,double breadth,Shapes ss)
	{
		ss.Area(length, breadth);
	}
	public static void main(String[] args) {
  
		Shapes ss = (length,breadth) -> { System.out.println("Area of Rectangle ="+ (length * breadth)); };
          
		ss.Area(15.51, 19.23);

	}

}
