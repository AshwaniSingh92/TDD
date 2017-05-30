package C_Methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StepReader {
	
	
	static ArrayList<String> tcid ;
	static String browser;
	static double iteration;
		
 public  void loader() throws IOException, EncryptedDocumentException, InvalidFormatException{
		
		
		String excelfilepath = "./TestData/TestData.xlsx";		
		 FileInputStream fis = new FileInputStream(new File(excelfilepath));				 
		 List<String>al = new ArrayList<String>();	
		 
		 tcid = new ArrayList<String>();		 
		 Workbook wb=WorkbookFactory.create(fis);		 
		 	
		 
		// System.out.println(cell1);
		 
		 
		 int total = wb.getNumberOfSheets();
		 
		for (int i = 0; i < total; ++i) {
			
	
		 
		 System.out.println("Current Sheet:"+wb.getSheetAt(i).getSheetName());
		 
	    		Sheet currentsheet = wb.getSheetAt(i);
	    		Iterator<Row> ritr = currentsheet.iterator();
	    		
	    		while(ritr.hasNext()){
	    			Row nextRow = ritr.next();
	    			
	    			if(nextRow.getRowNum()==0){
	    				
	    				continue;
	    			}
	    			
	    			
	    			if(nextRow.getRowNum() == currentsheet.getLastRowNum()+1){
	    				break;
	    			}
	    			
	    			Iterator<Cell> citr = nextRow.cellIterator();	    			
	    			
	    			while(citr.hasNext()){  
	    				
	    				Cell cell  = citr.next();
	    				
	    				
	    				DataFormatter formatter = new DataFormatter();	    				
	    				al.add(formatter.formatCellValue(cell));
	    				
	    			}	
	    			
	    			  
	    			
	    			System.out.println(al);
	    			
	    			//drive test
	    			
	    			al.clear();	    			
	    			
	    		}
	    		
	    		
	    		
	    		
		
		
	

	
		}
		

		
	
 }
}
