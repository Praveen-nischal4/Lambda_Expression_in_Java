// version 4 passing object with using Lambda expression
package Basic;


public class Revision3 {

	public static void main(String[] args) {
	
	
	
		Thread t = new Thread(
				() -> { System.out.println("This from Thread"); }
				);
		t.start();
	
	}

}
