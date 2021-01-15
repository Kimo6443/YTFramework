package string;

public class split {

	public static void main(String[] args) 
	{
		String s="kishor";
		int s1=s.length();
		System.out.println(s1);
		String rev="";
		for(int i=s1-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
			
		

	}

}
