package demonew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata 
{
	public static void main(String[] args) throws Throwable
	{
		//datawrite("sheet1", 1, 3);
		//dataread("sheet1", 1, 0);
		
	}

	public static void getRowcount()
	{
		try {
		XSSFWorkbook workbook=new XSSFWorkbook("./testdata/data.xlsx");
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows:"+rowcount);
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}
	}
	
	public static String dataread(String sheetname, int row, int colno) throws Throwable
	{
		File file = new File("./testdata/data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(colno).getStringCellValue();
		return data;
		
	}
	public static void datawrite(String sheetname,int row,int colno) throws IOException
	{
		/*File file = new File("./testdata/data.xlsx");
		FileOutputStream f=new FileOutputStream(file);
		Workbook w=WorkbookFactory.create(f);
		String data="welcome in apache poi";
		w.getSheet("sheet1").getRow(1).getCell(3);*/
		File src=new File("./testdata/data.xlsx");
		 FileOutputStream foutput=new FileOutputStream(src);
		 String message = "Data Imported Successfully.";
		 XSSFSheet sheet = null;
		sheet.getRow(1).createCell(3).setCellValue(message);
		         FileOutputStream fileOutput = new FileOutputStream(src);
		         
		        Workbook w=WorkbookFactory.create(src);

		
		          
	
		        fileOutput.close();
	}
		
	}
	

