package classes;
//use of "this" keyword
public class Student 
{
	int kishor;
	public Student (int kishor)
	{
		this.kishor=kishor;
		
	}
	public void display()
	{
		System.out.println(kishor);
	}
	

	public static void main(String[] args) 
	{
		Student s=new Student(10);
		s.display();
		
		

	}

}
