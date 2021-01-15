package ExcelFileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;




public class WriteToExcel {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException
	{
		File f=new File("C:\\Users\\Kishor\\Desktop\\1212.xls");
		WritableWorkbook ww=Workbook.createWorkbook(f);
		WritableSheet ws=ww.createSheet("sheetname", 0);//name and position
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Label l=new Label(j, i, "kimo");
				ws.addCell(l);
				
			}
		}
		ww.write();
		ww.close();
		

	}

}
