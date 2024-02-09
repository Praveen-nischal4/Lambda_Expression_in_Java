// Default method 

package Basic;

interface one
{
	default void message()
	{
		System.out.println("This is default message");
	}
}

interface two
{
	default void message()
	{
		System.out.println("This is default message");
	}
}

class Impl implements one ,two
{
   @Override
public  void message()
   {
	   two.super.message();
   }
}


public class Demo {	
	public static void main(String[] args) {
		
		Impl i = new Impl();
		i.message();
	}

}
