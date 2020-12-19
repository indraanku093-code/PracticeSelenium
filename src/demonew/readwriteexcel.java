package demonew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readwriteexcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("sheet3");
		//String data=sheet.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(" data from excel is:"+data);
		//workbook.close();
		sheet.getRow(1).createCell(2).setCellValue("pass");
		FileOutputStream fout=new FileOutputStream("./testdata/data.xlsx");
		workbook.write(fout);
		workbook.close();
	}
}
		
	
		


	

