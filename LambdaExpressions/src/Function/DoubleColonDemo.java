package Function;

public class DoubleColonDemo {

	static void Display()
	{
		System.out.println("This is from Dispaly");
	}
	public static void main(String[] args) {
       
		Runnable r1 = () -> System.out.println("This is from run method"); 
		
		Runnable r2 = DoubleColonDemo ::Display;
		r1.run();
		
		r2.run();

	}

}
