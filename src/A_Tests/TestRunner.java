package A_Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import C_Methods.StepReader;

public class TestRunner {

	
	public static void main(String args[]){
		
		
		
		
		StepReader sp = new StepReader();
		
		
		try {
			sp.loader();
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	
	
}
