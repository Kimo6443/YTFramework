package cast;

public class child extends parent
{

	
	public void display()
	   {
		System.out.println("child class display method");
		}
	
	public void display1()
	   {
		System.out.println("child class unique method");
				}
	public static void main(String[] args) 
	{
parent a=new child();
child a1=(child)a;//downcasting
a1.display();
a1.display1();
		
	}

}
