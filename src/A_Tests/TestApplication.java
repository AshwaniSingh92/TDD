package A_Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import C_Methods.StepReader;
import C_Methods.DriverFactory;
import C_Methods.PropertyReader;

public class TestApplication extends DriverFactory{

	
	
	
	
	@Test(dataProvider="Authentication")
	 
    public void Registration_data(String data1,String data2,String data3,String data4)throws  Exception{
 
     
		
		System.out.println(data1+""+data2+""+data3+""+data4+"");
		
		
		}
 
    @DataProvider
 
    public Object[][] Authentication() throws Exception{
 
         Object[][] testObjArray = StepReader.getTableArray();
 
         return (testObjArray);
 
		}
 
	
}
