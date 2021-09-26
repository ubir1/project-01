package appModules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.*;

public class FlightSearch {
	WebDriver driver;
	public FlightSearch(WebDriver driver) {
		this.driver = driver;
	}
	public void search() throws InterruptedException {
		Pages pages = new Pages(driver);
		//From
		pages.flight_page_from().click();
		pages.flight_page_from().sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		pages.flight_page_from().sendKeys("Dhaka");
		Thread.sleep(2000);
		pages.flight_page_from().sendKeys(Keys.ENTER);
		//To
		pages.flight_page_to().sendKeys("Phuket");
		Thread.sleep(2000);
		pages.flight_page_to().sendKeys(Keys.ENTER);
		//Depart Date
		//driver.findElement(By.cssSelector("#component_7 > div > div.govHnqb6 > div > div > div > div._1XACCj8E > div > div._1STd2IBM._1TUUFLCl > div > div:nth-child(1) > div > div > div._3i2rQ5SF")).sendKeys("09/09/2021");
		//Return Date 
		//Travelers
		//driver.findElement(By.cssSelector("#component_7 > div > div.ucguE.M-.P6 > div > div > div > div.cViCf > div > div.cPuYE.Wdjef > div")).click();
		//driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div._1HphCM4i > div > div > div:nth-child(2) > div > div > div._2K21K4KN > div:nth-child(1) > div._2TlWeXuL > span:nth-child(2) > svg")).click();
		//driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div._1HphCM4i > div > div > div:nth-child(2) > div > div > div._2K21K4KN > div:nth-child(3) > div._2TlWeXuL > span:nth-child(2) > svg")).click();
		//driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div._1HphCM4i > div > div > div:nth-child(2) > div > div > div._35g714Eo > div > div._30gfHuIZ > div > div")).click();
		//driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div._1HphCM4i > div > div > div:nth-child(2) > div > div > div._35g714Eo > div > div._30gfHuIZ > div > div._16IExTAJ._1S9IhgUs > div:nth-child(2) > div")).click();
		//driver.findElement(By.cssSelector("#component_7 > div > div.govHnqb6 > div > div > div > div._1XACCj8E > div > div._1STd2IBM.Dit9-bMd > div")).click();
		Thread.sleep(4000);
		if(pages.flight_page_external().isSelected())
		{
			pages.flight_page_external().click();
		}
		pages.flight_page_submit().click();
	}
}
