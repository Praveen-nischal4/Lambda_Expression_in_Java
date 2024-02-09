package LambdaConcept;

@FunctionalInterface
interface Addition
{
	abstract void add(int a,int b);
}


public class Example1 {

	public static void main(String[] args) {

   // int a=7,b=8;
    
    Addition ad = (x,y) -> {  System.out.println("Sum ="+ (x+y)); };
    	 	
     ad.add(5, 9);        //calling lambda Expression
	}

}
