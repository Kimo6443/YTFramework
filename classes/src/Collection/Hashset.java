package Collection;

import java.util.HashSet;

public class Hashset//output is not in order & no repeat value
{

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();//integer is class tf we can add only int
        hs.add(12);
        hs.add(22);
        hs.add(12);
        
        for(Integer i:hs)  //For each loop
        {
        	System.out.println(i);
        }
	}

}
