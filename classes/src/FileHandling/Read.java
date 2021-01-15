package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	
	public void read(int a) throws IOException 
	{
		File f= new File("../classes/mydoc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr); 
		for(int i=1;i<=a;i++)
		{
			br.readLine();
			br.close();
		}
	}
	public static void main(String[] args) throws IOException
	{
		Read r=new Read();
		r.read(3);

	}

}
