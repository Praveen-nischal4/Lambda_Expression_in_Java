//Example of Anonymous Class


package Basic;

interface Payment
{
	abstract void doPayment();
}

public class AnonyClass {

	public void Display()
	{
		
	 Payment p =new Payment()
		{
			
			 public void doPayment()
			{
				System.out.println("Payment using wallet ,App are permissiable");
			}
		};
		p.doPayment();
	}
	public static void main(String[] args) {

     AnonyClass an = new AnonyClass();
     an.Display();
		
	}

}
