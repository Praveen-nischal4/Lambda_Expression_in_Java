package Predicate;

import java.util.function.*;

public class Prog2 {

	public static void main(String[] args) {
 
		Integer []arr = {2,45,12,9,7,8,19,25};
		
		Predicate<Integer> gt = (i) -> i>10;
	     
		System.out.println(" Number greater than 10 :");
		Prog2.myMethod(gt,arr);     
	}
	
	public static void myMethod(Predicate<Integer>p , Integer []arr)
	{
		for(Integer i:arr)
		{
			if(p.test(i))
				System.out.println(i+" ");
		}
	}

}
