package Conditions;

public class Prime {

	public static void main(String[] args)
	{
		int num=9;
		int temp=0;
		
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if (temp==1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime ");
		}

	}

}
