package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineRange {

	public void line(int range1,int range2,String path) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int count=0;
		while((s=br.readLine())!=null)
		{
			count=count+1;
			if(count>=range1&&count<=range2)
			{
				System.out.println(s);
				
			}
		}
	}
	public static void main(String[] args) throws IOException
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("range 1");
		int range1=scn.nextInt();
		System.out.println("range 2");
		int range2=scn.nextInt();
		LineRange l=new LineRange();
		l.line(range1, range2, "../classes/mydoc.txt");
	}

}
