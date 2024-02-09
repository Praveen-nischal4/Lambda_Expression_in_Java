//Passing Lambda Expression to object verion 3
//using anyonymous class

package LambdaConcept;

public class MyClass3 {
	
	public static void main(String[] args) {
		//create Thread object and pass it to the anonymous class
		
		Thread t = new Thread(new  Runnable()
		{
			//implemenents the run method of Runnable Interface
	public void run()
	{
		System.out.println("This is from thread");
	}
		});
//run the thread
t.start();
	}

}
