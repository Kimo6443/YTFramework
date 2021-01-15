package classes;

public class ClassB extends ClassA
{int h=0;
	public void sum(int d,int e,int g)
	{
		int h=9;
		int f;
		f=d*e*g;
		System.out.println(f);
		
	}
	public static void main(String[] args) 
	{
		ClassA obj=new ClassB();
		obj.sum(2, 2, 2);
		
		System.out.println(obj.h);//ref variable WHOSE value will remain as it is in parent
		ClassA obj1=new ClassA();
		obj1.sum(2, 2, 2);

	}

}
