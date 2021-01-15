package Collection;

import java.util.LinkedHashSet;

public class LinkedHash //output is in order & no duplicate allowed
{

	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();//here strng class used so only string input
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("A");
		
		for(String s:lh)
		{
			System.out.println(s);
		}

	}

}
