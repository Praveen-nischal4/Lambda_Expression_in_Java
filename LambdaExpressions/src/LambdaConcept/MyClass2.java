//passing l.E to object version 2
//if you dont want to implement runnable interface with thi class then version 2

package LambdaConcept;



public class MyClass2 {	
	
	public static void main(String[] args){
	     
		Thread t = new Thread(new Implclass());
		t.start();
	}
	}

class Implclass implements Runnable
{
  @Override
  public void run() {
        System.out.println("This is form Implementation class");
        }
}

