package LambdaConcept;

import java.util.function.*;

public class CheckMethod {

	public static void main(String[] args) {

 Predicate<Integer> gt = (i) -> i>10;          // Predicate<Integer> is a functional interface, so can be referenced as LE
 
         boolean result = gt.test(20);            // with refernce of Predicate interface call test()
         
 System.out.println(" Greater then 10 ="+result);     // finally print the result

	}

}
