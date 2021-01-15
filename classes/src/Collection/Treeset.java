package Collection;

import java.util.TreeSet;

public class Treeset//output will be in ascending order & no duplicate allowed
{

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("A");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		
		for(String s:ts)
		{
			System.out.println(s);
		}

	}

}
