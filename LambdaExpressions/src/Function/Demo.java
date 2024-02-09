package Function;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {  
  
  Function<String,Integer> len =  (str) -> str.length();
  
  String str =" My DreamTech Publication";
  
  System.out.println("Length of String ="+len.apply(str));

	}

}
