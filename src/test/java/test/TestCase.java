package test;

import org.apache.log4j.xml.DOMConfigurator;

import config.Constants;
import utility.ExcelUtils;

class TestCase {
	
	TestCase() throws Exception{
		ExcelUtils.setExcelFile(Constants.Excel_File_Path, Constants.Excel_File_Sheet_Name);
		DOMConfigurator.configure(Constants.Log_Conf_File_Name);
	}
}
