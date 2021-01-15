package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineNumber {

	public void readparticularline(int linenumber,String path) throws IOException
	{
		File f= new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int count=0;String s;
		while((s=br.readLine())!=null)
		{
			count++;     //gets increment line by line
			if(count==linenumber)
			{
				System.out.println(s); break;
		
			}
			
		}
	}
	public static void main(String[] args) throws IOException 
	{
		LineNumber l=new LineNumber();
		l.readparticularline(3,"../classes/mydoc.txt");

	}

}
