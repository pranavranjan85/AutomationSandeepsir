package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/test2.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int noOfRow = wb.getSheet("login").getLastRowNum();
	short noOfCell = wb.getSheet("login").getRow(1).getLastCellNum();
	for(int i=0;i<=noOfRow-1;i++) {
		for(int j=0;j<=noOfCell-1;j++) {
	String print = wb.getSheet("login").getRow(i).getCell(j).getStringCellValue();
	System.out.print("  "+print);
	}
	System.out.println();
	}
	}

}
