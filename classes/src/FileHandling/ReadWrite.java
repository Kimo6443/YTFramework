package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public void readwrite(int data,String writefilepath) throws IOException
	{
		File f= new File("../classes/mydoc.txt");
		File f1=new File("../classes/mydoc1.txt");
		FileReader fr=new FileReader(f);
		FileWriter fw=new FileWriter(f1);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String s;

		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}
	public static void main(String[] args) throws IOException 
	{
		ReadWrite r=new ReadWrite();
		r.readwrite(2, "../classes/mydoc1.txt");

	}

}
