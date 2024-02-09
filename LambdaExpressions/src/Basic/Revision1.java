//Revision of Lambda Expression
// without argument
package Basic;

@FunctionalInterface
interface Student2
{
	abstract void Register();
}


public class Revision1 {

	public static void main(String[] args) {

 Student2 s = () -> { System.out.println("Student must rgister to do online class"); };
  
 s.Register();
	}

}
