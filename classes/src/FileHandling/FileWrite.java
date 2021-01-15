package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException 
	{
	File f=new File("../classes/mydoc1.txt");
	FileWriter fw=new FileWriter(f);
	fw.write("my name is khan");
	fw.write("my name is khan");
	fw.close();//for saving and closing

	}

}
