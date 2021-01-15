
package Conditions;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args)
	{
		System.out.println("enter number-");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int f=1;
		
	for(int i=1;i<=num;i++)
	{
		f=f*i;
	}
	System.out.println(f);

	}

}
