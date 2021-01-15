package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	
	public void output() throws BiffException, IOException
	{
		File f=new File("C:\\Users\\Kishor\\Desktop\\myexcel.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet(0);
		int r=s.getRows();
		int c=s.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=s.getCell(j, i);
				System.out.println(c1.getContents());
				
			}
		}
		
	}
	public static void main(String[] args) throws BiffException, IOException 
	{
		ReadExcel ra=new ReadExcel();
		ra.output();

	}


}
