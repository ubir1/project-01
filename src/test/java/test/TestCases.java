package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import utility.ExcelUtils;
import utility.Log;
import pages.*;
import appModules.*;
import config.ActionKeywords;
import config.Constants;

public class TestCases {
	
	public static ActionKeywords actionKeywords;
	public static String dActionKeyword;
	public static Method method[];
	//public static WebDriver driver;
	
	//public TestCases() {
	//	
	//}
	
	//@Test //if flight checkout is working
	public void flightCheckout() throws Exception{
		DOMConfigurator.configure(Constants.Log_Conf_File_Name);
		//Log.
		Log.startTestCase(Constants.Testcase_Name_1);
		ExcelUtils.setExcelFile(Constants.Excel_File_Path, Constants.Excel_File_Sheet_Name);
		actionKeywords = new ActionKeywords();
		method = actionKeywords.getClass().getMethods();
		//System.out.println(method.length);
		//driver = ActionKeywords.driver;
		
		for(int iRow = 1; iRow <= Constants.Excel_Max_Row_No; iRow++) {
			String dActionKeyword = ExcelUtils.getCellData(iRow, Constants.Excel_Action_Keyword_Col_No);
			//System.out.println(dActionKeyword + "d");
			for(int i = 0;i < method.length;i++){
				//System.out.println(method[i].getName() + "a");
				if(method[i].getName().equals(dActionKeyword)){
					//System.out.println(dActionKeyword + "2");
					method[i].invoke(actionKeywords);
					//System.out.println(actionKeywords);
					//break;
				}
				else {
					//System.out.println(dActionKeyword + i);
					//System.out.println(method[i].getName() + i);
				}
			}
		}
	    
	    Log.endTestCase(Constants.Testcase_Name_1);
	    
	}
	
	//@Test //if hotel checkout is working
	void hotelCheckout() {
		Log.startTestCase(Constants.Testcase_Name_2);
		Log.endTestCase(Constants.Testcase_Name_2);
	}
	
	//@Test //if things checkout is working
	void thingsToDoCheckout() {
		Log.startTestCase(Constants.Testcase_Name_3);
		Log.endTestCase(Constants.Testcase_Name_3);
	}
	
	public static void main(String args[]) {
		TestCases test = new TestCases();
		try{
			test.flightCheckout();
		}catch(Exception e){
			Log.error(e.getMessage());
			ActionKeywords.driver.close();
		    ActionKeywords.driver.quit();
		}
		test.hotelCheckout();
		test.thingsToDoCheckout();
	}
}
