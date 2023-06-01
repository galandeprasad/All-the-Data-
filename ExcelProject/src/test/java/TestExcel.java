import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {

	public static void main(String[] args) throws IOException 
	{
	
	   FileInputStream Fls=new FileInputStream("D://TestExcel//TestData.xlsx");
	   
       XSSFWorkbook books=new XSSFWorkbook(Fls);
       
        int Sheets = books.getNumberOfSheets();
        
        for(int i=0;i<Sheets;i++)
        {
        	
        	if(books.getSheetName(i).equalsIgnoreCase("Testdata"))
        	{
        		
        		
        		XSSFSheet sheet = books.getSheetAt(i);
        		Iterator<Row> row = sheet.iterator();
        		Row firstrow = row.next();
        		
        		Iterator<Cell> cell = firstrow.cellIterator();
        		
        		while(cell.hasNext())
        		{
        			Cell values = cell.next();
        			
        			if(values.getStringCellValue().equalsIgnoreCase("LoginData")) 
        			{
        				
        				System.out.println("ok");
        			}
        			
        		}
        		
        	}
        	
        	
        	
        }
        
		
	}

}
