package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import tests.Base;

public class ExcelUtils extends Base{
	public static XSSFSheet sheet;
	
	public ExcelUtils() throws Throwable {
		File file=new File("src/test/resources/testData/UserDetails.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	    sheet=wb.getSheet("User");
	}
	
	public ArrayList<String> getRowDatas(int row) {
		int columns=sheet.getRow(row-1).getLastCellNum();
		data=new ArrayList<String>();
		for(int i=0;i<columns;i++) {
			String value=sheet.getRow(row-1).getCell(i).toString();
			data.add(value);
		}
		return data;
	}

}
