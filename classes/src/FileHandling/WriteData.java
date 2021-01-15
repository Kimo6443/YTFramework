package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
	String s;
	public void write(String s) throws IOException
	{
		this.s=s;
		File f=new File("../classes/mydoc.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(s);
		bw.newLine();
		bw.close();
	}
	public static void main(String[] args) throws IOException
	{
		Scanner scn=new Scanner (System.in);
		
		System.out.println("enter data to write");
		String s=scn.nextLine();
		
		WriteData w=new WriteData();
		w.write(s);

	}

}
