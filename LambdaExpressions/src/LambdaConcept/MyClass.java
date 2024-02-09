//Passing lambda expression to object

package LambdaConcept;

public class MyClass implements Runnable
 {

	@Override
	public void run() {

System.out.println("This is from thread");
		
	}
	

	public static void main(String[] args) {
		
		MyClass my = new MyClass();
	
		Thread t = new Thread(my);
		t.start();

	}

}
