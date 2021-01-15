package exception;

public class exceptn {

	public static void main(String[] args) 
	{
		System.out.println("i am first line");
		try
		{
			int[] b=new int[2];
			b[3]=233;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("i am second line");
		System.out.println("i am second line");
	}

}
