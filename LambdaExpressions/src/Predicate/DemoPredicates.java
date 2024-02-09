package Predicate;

import java.util.function.Predicate;

public class DemoPredicates {

	public static void main(String[] args) {
		
		Integer []arr = {1,4,8,12,45,3,71,29,43,24,56};
		
		Predicate<Integer> all, even ;
		
		all = (n) ->true;
		
		even = (n) -> n%2==0;
		
		System.out.println("All numbers are");
		display(all,arr);
		
		System.out.println("\n"+"All even numbers are");
		display(even,arr);		
	}
	
     public static void display(Predicate<Integer> p ,Integer[] arr)
	{
		for(Integer i:arr)
		{
			if(p.test(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
