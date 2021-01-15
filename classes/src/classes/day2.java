package classes;

public class day2 
{
   public int add(int a,int b)
   {
	   int c;
	   c=a+b;
	   return c;
	   
   }
   
        public int sub(int x,int y)
        {
	      int z;
	      z=x+y;
	      return z;
        }
        
           public void multi(int m1,int m2)
           {
        	   int m3;
        	   m3=m1*m2;
        	   System.out.println("result-"+m3);
           }
           
               public static void main(String[] args) 
               {
			    day2 a=new day2();
			    int result1=a.add(10, 2);
			    int result2=a.sub(10, 2);
			    a.multi(result1, result2);
			    
		       }
}
