package Conditions;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args)
	{
		System.out.println("enter value of a-");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
				
				if((marks>=0) && (marks<35))
				{
					System.out.println("fail");
				}
		   
				else if ((marks>=35) || (marks<60))
				{
					System.out.println("second class");
				}

	}

}
