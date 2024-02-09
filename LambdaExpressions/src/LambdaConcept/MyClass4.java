//passing Lambda Expression to object 
//version 4 using anonymous class

package LambdaConcept;

public class MyClass4 {

	public static void main(String[] args) {
 
		Thread t = new Thread(
		 () -> { System.out.println("this is from Thread");}
		 );
		t.start();
				

	}

}
