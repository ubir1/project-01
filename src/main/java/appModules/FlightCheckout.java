package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pages.*;

public class FlightCheckout {
	WebDriver driver;
	public FlightCheckout(WebDriver driver) {
		this.driver = driver;
	}
	public void fillPassenger() {
		Pages pages = new Pages(driver);
	    //Passenger 1
	    pages.edream_pass_1_first_name().sendKeys("Abir");
	    pages.edream_pass_1_last_name().sendKeys("Khan");
	    
	    //Passenger 2
	    //driver.findElement(By.cssSelector("#passengers1 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div:nth-child(1) > div > input")).sendKeys("Tasnia");
	    //driver.findElement(By.cssSelector("#passengers1 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div:nth-child(2) > div > input")).sendKeys("Hassan");
	    //Select gender = new Select(driver.findElement(By.cssSelector("#passengers1 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div.odf-form-field.validation_field.traveller_gender_combo.valid > div > select")));
	    //gender.selectByValue("Female");
	    
	    //Passenger 3
	    //driver.findElement(By.cssSelector("#passengers2 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div:nth-child(1) > div > input")).sendKeys("Aniya");
	    //driver.findElement(By.cssSelector("#passengers2 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div:nth-child(2) > div > input")).sendKeys("Khan");
	    //gender = new Select(driver.findElement(By.cssSelector("#passengers2 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div.odf-form-field.validation_field.traveller_gender_combo > div > select")));
	    //gender.selectByValue("Female");
	    //Select month = new Select(driver.findElement(By.cssSelector("#passengers2 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div.od-date-field > div > div > span:nth-child(2) > select")));
	    //month.selectByValue("10");
	    //Select date = new Select(driver.findElement(By.cssSelector("#passengers2 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div.od-date-field > div > div > span:nth-child(3) > select")));
	    //date.selectByValue("24");
	    //Select year = new Select(driver.findElement(By.cssSelector("#passengers2 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div.od-date-field > div > div > span:nth-child(3) > select")));
	    //year.selectByValue("2020");		
	}
	public void fillSeat() throws InterruptedException {
		Pages pages = new Pages(driver);
	    //Plane 01
	    pages.edream_pass_1_plane_1_seat().click();
	    //driver.findElement(By.cssSelector("#aircraft_map_16B > div")).click();
	    Thread.sleep(2000);
	    
	    //Plane 02
	    pages.edream_pass_1_plane_2_seat().click();
	    //driver.findElement(By.cssSelector("#aircraft_map_18A > div")).click();
	    Thread.sleep(2000);
	    
	    //Plane 03
	    pages.edream_pass_1_plane_3_seat().click();
	    //driver.findElement(By.cssSelector("#aircraft_map_42B > div")).click();
	    Thread.sleep(2000);
	    //Plane 04
	    pages.edream_pass_1_plane_4_seat().click();
	    //driver.findElement(By.cssSelector("#aircraft_map_43B > div")).click();
	    Thread.sleep(2000);		
	}
	public void fillBill() throws InterruptedException {
	    Pages pages = new Pages(driver);
		//Bill
	    pages.edream_bill_mail().sendKeys("khan.abir111@gmail.com");
	    pages.edream_bill_confirm_mail().sendKeys("khan.abir111@gmail.com");
	    pages.edream_bill_address().sendKeys("Dhanmondi");
	    pages.edream_bill_city().sendKeys("Dhaka");
	    Thread.sleep(1000);
	    Select edream_bill_country = new Select(pages.edream_bill_country());
	    edream_bill_country.selectByValue("BD");
	    //Select state = new Select(driver.findElement(By.cssSelector("#passengers2 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div.od-date-field > div > div > span:nth-child(3) > select")));
	    //state.selectByValue("2020");
	    pages.edream_bill_zip().sendKeys("1234");
	    Select edream_bill_country_code = new Select(pages.edream_bill_country_code());
	    edream_bill_country_code.selectByValue("BD");
	    pages.edream_bill_phone().sendKeys("1234567890");	
	}
}
