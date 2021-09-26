package config;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModules.FlightCheckout;
import appModules.FlightSearch;
import pages.Pages;
import utility.ExcelUtils;
import config.Constants;

public class ActionKeywords {
		public static WebDriver driver;
		static Pages pages;
		static FlightSearch flightSearch;
		static FlightCheckout flightCheckout;
		public static String dDataSet;
		
	public static void openBrowser() throws Exception {
		//System.out.println("0");
		String dDataSet = ExcelUtils.getCellData(1, Constants.Excel_Data_Set_Col_No);
		System.setProperty(Constants.Browser_Key_Chrome, Constants.Browser_Path_Chrome);
		//System.out.println(dActionKeyword);
		if(dDataSet.equals("Chrome")){
			driver = new ChromeDriver();
		}		
		pages = new Pages(driver);
		flightSearch = new FlightSearch(driver);
		flightCheckout = new FlightCheckout(driver);
		
		//System.out.println(driver);
		driver.manage().window().maximize();
	}
	public static void navigate() throws InterruptedException {
		//URL
		driver.get(Constants.Url);
		if(driver.findElement(By.tagName("title")).getText().equals("Tripadvisor: Read Reviews, Compare Prices & Book"))
		{
			System.out.println("In Tripadvisor website");
		}
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Menu
		
		//System.out.println(driver);
	}
	public static void navigateToFlightPage() throws InterruptedException {
		pages.menu_more().click();
		Thread.sleep(1000);
		pages.more_flight().click();
		Thread.sleep(2000);
		//Flight Page
		if(driver.getCurrentUrl().contains("Flights-"))
		{
			System.out.println("In Tripadvisor Flight Page");
		}
	}
	public static void searchFlight() throws InterruptedException {
		flightSearch.search();
	}
	public static void serachFlightDeal() throws InterruptedException {
		//Flight Deal
		Thread.sleep(2000);
		if(driver.getCurrentUrl().contains("CheapFlightsSearch"))
		{
			System.out.println("In Tripadvisor Flight Deal Page");
		}
		pages.flight_deal_page_deal().click();
		pages.flight_deal_page_external().click();
	}
	public static void checkoutFlight() throws InterruptedException {
		//Flight Tab
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		
	    Thread.sleep(40000); 
	    if(driver.getCurrentUrl().contains("edreams."))
		{
			System.out.println("In eDreams Page");
		}
	    //Agree
	    pages.edream_agree().click();
	    
	    //Travel Plan Type
	    //if(driver.findElement(By.cssSelector("#details-manager > div.od-detailsmanager.details_manager_data > div.conchita.conchita-fare-rules > div > div > div > div.e1k0517d0.css-scbk6v-Box-BaseFlex.ec1bx0a0 > div.en0ue580.show-legend.eglcm90.css-19v1lur-Box-BaseFlex.ec1bx0a0 > div:nth-child(2) > div > button")).isDisplayed()) {
	    //	driver.findElement(By.cssSelector("#details-manager > div.od-detailsmanager.details_manager_data > div.conchita.conchita-fare-rules > div > div > div > div.e1k0517d0.css-scbk6v-Box-BaseFlex.ec1bx0a0 > div.en0ue580.show-legend.eglcm90.css-19v1lur-Box-BaseFlex.ec1bx0a0 > div:nth-child(2) > div > button")).click();
	    //}

	    flightCheckout.fillPassenger();
	    flightCheckout.fillSeat();
	    flightCheckout.fillBill();
	    
	    //Continue
	    pages.edream_bill_continue().click();
	    
	    //Summary Page Loaded ?
	    if(driver.getCurrentUrl().contains("CheapFlightsSearch"))
		{
			System.out.println("In eDreams Summary Page");
		}
	    
	    if(driver.getCurrentUrl().contains("CheapFlightsSearch"))
		{
			System.out.println("In Tripadvisor Flight Deal Page");
		}
	    
	    driver.close();
	    driver.quit();
	}

}
