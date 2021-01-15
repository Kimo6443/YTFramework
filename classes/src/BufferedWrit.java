import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWrit {

	public static void main(String[] args) throws IOException 
	{
     File f=new File("../classes/mydoc.txt");
     FileWriter fw=new FileWriter(f,false);
     
     fw.write("pagal khan");
     fw.close();

	}

}
