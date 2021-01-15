package ExcelFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Write1 {

	public void output(int row,int col) throws IOException, WriteException
	{
		
		{
			File f=new File("C:\\Users\\Kishor\\Desktop\\111.xls");
			WritableWorkbook ww=Workbook.createWorkbook(f);
			WritableSheet ws=ww.createSheet("kimo", 0);//name and position
			int count=0;
			for(int i=0;i<6;i++)
			{
				for(int j=0;j<6;j++)
				{
					count++;
					if(count==row&&count==col)
					{
						Label l1=new Label(j, i, "kish");
						ws.addCell(l1);
					}
					
				}
			}
			ww.write();
			ww.close();
			

		}
	}
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("no. of row-");
		int row=scn.nextInt();
		System.out.println("no. of columns-");
		int col=scn.nextInt();
	}

}
