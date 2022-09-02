package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {
/**
 * 
 * @param key
 * @return
 * @throws IOException
 */
	public String getPropertyData(String key) throws IOException 
	{
	FileInputStream fis=new FileInputStream("./data/comman.property");
	Properties p=new Properties();
	p.load(fis);
	String keys = p.getProperty(key);
	return keys;
	}
/**
 * 
 * @param sheet
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./data/test2.xlsx");
 Workbook wb = WorkbookFactory.create(fis);
String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
return data;
}
/**
 * 
 * @param sheetname
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void setExcelData(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
}
}