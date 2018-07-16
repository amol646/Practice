package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities 
{
	static Workbook wrkbk;
	static List< Map<String,String> > testData = new ArrayList<Map<String,String>>();
	
	public static void readExcel(String FilePath)
	{
		try {
				wrkbk = new XSSFWorkbook(new File(FilePath));
				Sheet wrksht = wrkbk.getSheetAt(0);
				int rwcnt = wrksht.getLastRowNum()+1; //because of jar issue
				ArrayList<String> keys = gettdcolnames(wrksht);
				for(int j=1; j<rwcnt ; j++)
				{
					Map<String,String> mapRw = new HashMap<String,String>();
					Row rw = wrksht.getRow(j);
					int colcnt = rw.getLastCellNum();
					
					for(int k=0; k  <colcnt ; k++)
					{
						Cell col = rw.getCell(k);
						String cellval ;
						if(col.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
						{
							cellval = Double.toString(col.getNumericCellValue());
						}
						else
						{
							cellval = col.getStringCellValue();
						}
						
						mapRw.put(keys.get(k), cellval);
					}
					
					testData.add(mapRw);
				}
			
			
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<String> gettdcolnames(Sheet currentSheet)
	{
		//Sheet mysht = wrkbk.getSheetAt(0);
		ArrayList<String> key = new ArrayList<String>();
		Row myrw = currentSheet.getRow(0);
		int mycolcnt = myrw.getLastCellNum();
		for(int p=0 ;p<mycolcnt ;p++)
		{
			Cell mycol = myrw.getCell(p);
			key.add(mycol.getStringCellValue());
			
		}
		return key;
		
	}
	
	public static String getTestData(String TC_number,String coloumnName)
	{
		for(Map<String,String>map : testData)
		{
			String testCaseNumber = map.get("TCID");
			if(testCaseNumber.equalsIgnoreCase(TC_number))
			{
				return map.get(coloumnName).toString();
			}
		}
		return "";
	}
	
	
}
