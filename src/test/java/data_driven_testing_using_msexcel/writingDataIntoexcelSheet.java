package data_driven_testing_using_msexcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingDataIntoexcelSheet {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		XSSFRow row1=sheet.createRow(0);
		
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue("12345");
		row1.createCell(2).setCellValue("xyz");
		
		XSSFRow row2=sheet.createRow(1);
		
		row2.createCell(0).setCellValue("abc");
		row2.createCell(1).setCellValue("4545");
		row2.createCell(2).setCellValue("testing");
		
		//creating rows, cells and update data using loop
		Scanner sc=new Scanner(System.in);
		
		for(int c=0; c<2; c++) {
			//currentrow.createCell(c).setCellvalue("welcome);
			
			System.out.println("enter a value");
			String value=sc.next();
			//currentrow.createCell(c).setCellValue(value);
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("writing is done...");
		
		
		
		
		
		
		
	}

}
