import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testExcel 
{

	public ArrayList<String> DataDrive(String Testvalue) throws IOException
	{
        ArrayList<String> arr=new ArrayList<String>();
		FileInputStream Fil = new FileInputStream("D://TestExcel//excelData.xlsx");
		XSSFWorkbook wBook = new XSSFWorkbook(Fil);
		int SheetCount = wBook.getNumberOfSheets();
		for (int i = 0; i < SheetCount; i++) {
			if (wBook.getSheetName(i).equalsIgnoreCase("Testdata")) {
				XSSFSheet sheet = wBook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();

				Row Firstrow = row.next();
				// Cell iterators
				Iterator<Cell> cellit = Firstrow.cellIterator();
				int k = 0;
				int Col = 0;
				while (cellit.hasNext()) {
					Cell value = cellit.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCase")) {
						System.out.println("Prasad");
						Col = k;
					}
					k++;

				}
				System.out.println(Col);

				while (row.hasNext()) {
					Row r = row.next();
					if (r.getCell(Col).getStringCellValue().equalsIgnoreCase(Testvalue)) {
						Iterator<Cell> vr = r.cellIterator();
						while (vr.hasNext()) 
						{
							Cell v = vr.next();
						if(v.getCellType()==CellType.STRING)
						{
							arr.add(v.getStringCellValue());
						}
						else
						{
							arr.add(NumberToTextConverter.toText(v.getNumericCellValue()));
								
						}
						
						}

					}

				}

			}

		}
      return arr;
	}
	
	
	
	public static void main(String[] args) throws IOException 
	{
	}
	

}
