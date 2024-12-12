package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FBUtils 
{	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public FBUtils(String excelPath) throws IOException
	{
	 try {
				FileInputStream fi=new FileInputStream("C:\\Users\\user\\Desktop\\Book.xlsx");
				workbook=new XSSFWorkbook(fi);
				sheet=workbook.getSheetAt(0);
	}catch(Exception e)
	 {
		e.printStackTrace();
	 }
}	
	public String getCellData(int row,int col)
	{
		return sheet.getRow(row).getCell(col).getStringCellValue();
		
	}
	public int getRowCount()
	{
		return sheet.getLastRowNum();		
	}
	public void closeWorkbook()
	{
		try {
			   workbook.close();
		    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
