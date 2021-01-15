package classes;

public class Constructor 
{
	
	static int i;
	static String s;
	static double d;
	static float f;
	
	
	public Constructor(int i,String s,double d,float f)
	{
	
		this.i=i;this.s=s;this.d=d;this.f=f;
	}
	
public static void main(String[] args) 
{
	Constructor z=new Constructor(1,"kishor",1.11d,2.22f);
	System.out.println(i);
	System.out.println(s);
	System.out.println(d);
	System.out.println(f);
}
}
