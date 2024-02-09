package LambdaConcept;

public class Demo {

	int x=20;           //class variable
	
	public void method()
	{
		int x=10;
		
		Runnable r = () -> { System.out.println("class variable ="+this.x);
		    System.out.println("method variable ="+x);
		};
		
		Thread t =new Thread(r);
		t.start();
	}
	
	public static void main(String[] args) {
	Demo d= new Demo();
	d.method();

	}

}
