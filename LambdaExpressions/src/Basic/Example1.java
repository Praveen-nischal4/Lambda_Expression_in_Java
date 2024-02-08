//Revision of Local class

package Basic;

interface Student
{
	abstract void registration();           //interface Student
}


public class Example1 {

	public void display()
	
	{ 
		class StudentRecord implements Student
		{

			@Override
			public void registration() {

          System.out.println("Student need to Register for course");
			}
			
		}
		
		StudentRecord sr = new StudentRecord();
		sr.registration();
	 	
	}
	public static void main(String[] args) {
		Example1 e = new Example1();
		e.display();
	}

}
