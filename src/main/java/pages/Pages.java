package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Pages implements Page{
	
	WebDriver driver;
	By menu_more = By.cssSelector("#lithium-root > main > div.crvbs > div.bOoyS.Gi._T.cUjdV > div > div > div:nth-child(17) > div > button");
	By more_flight = By.cssSelector("#menu-item-3 > div > span");
	By flight_page_from = By.cssSelector("#component_7 > div > div.ucguE.M-.P6 > div > div > div > div.cViCf > div > div.cPuYE.IQrwn > div > div:nth-child(1) > div > div > div > input");
	By flight_page_to = By.cssSelector("#component_7 > div > div.ucguE.M-.P6 > div > div > div > div.cViCf > div > div.cPuYE.IQrwn > div > div:nth-child(2) > div > div > div > input");
	By flight_page_external = By.cssSelector("#component_7 > div > div.ucguE.M-.P6 > div > div > div > div.IbnDD > div.cBlJr.f.K.u > span:nth-child(1) > div.czwui > label > span");
	By flight_page_submit = By.cssSelector("#component_7 > div > div.ucguE.M-.P6 > div > div > div > div.fItos.w > button");
	By flight_deal_page_deal = By.cssSelector("#MAIN > div > div.bWiwA.dmnIF.scrollAdMain.withLeftRail > div > div.ui_column.is-12-mobile.bTQXt.is-9-widescreen > div > div.czZSU > div.Ujoyv > div > div:nth-child(3) > div > div > div > div.fvFps > div > div.hRMRr > div > button > div");
	By flight_deal_page_external = By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.eDPnv.D.X0.X1.Za > div > div.dQSnI.h.S2.H2._f.dabFk > div > div.bAUKD > div.VQgJr > div > div > div > div.cwXYz > div > div > div > div > div.bOqhz > div > div.dTaBF.C0.ui_column.is-7-tablet.is-7-mobile > div > button");
	By edream_agree = By.cssSelector("#didomi-notice-agree-button");
	By edream_pass_1_first_name = By.cssSelector("#passengers0 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div:nth-child(1) > div > input");
	By edream_pass_1_last_name = By.cssSelector("#passengers0 > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.odf-form-row.od-passengersmanager-form-row-user-fields > div:nth-child(2) > div > input");
	By edream_pass_1_plane_1_seat = By.cssSelector("#aircraft_map_16A > div");
	By edream_pass_1_plane_2_seat = By.cssSelector("#aircraft_map_17A > div");
	By edream_pass_1_plane_3_seat = By.cssSelector("#aircraft_map_42A > div");
	By edream_pass_1_plane_4_seat = By.cssSelector("#aircraft_map_42B > div");
	By edream_bill_mail = By.cssSelector("#buyer > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.editable_buyer_layer.expanded.od-editable_buyer_layer.od-collapsible > div > div > div > div.odf-form-row.buyer_editable_email > div:nth-child(1) > div.odf-form-field.validation_field.odf-nospace-inner > div > input");
	By edream_bill_confirm_mail = By.cssSelector("#buyer > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.editable_buyer_layer.expanded.od-editable_buyer_layer.od-collapsible > div > div > div > div.odf-form-row.buyer_editable_email > div:nth-child(2) > div.odf-form-field.validation_field.validation_mail_container.od-validation-mail-container.odf-nospace-inner > div > input");
	By edream_bill_address = By.cssSelector("#buyer > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.editable_buyer_layer.expanded.od-editable_buyer_layer.od-collapsible > div > div > div > div:nth-child(3) > div:nth-child(1) > div > input");
	By edream_bill_city = By.cssSelector("#buyer > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.editable_buyer_layer.expanded.od-editable_buyer_layer.od-collapsible > div > div > div > div:nth-child(3) > div:nth-child(2) > div > input");
	By edream_bill_country = By.cssSelector("#buyer > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.editable_buyer_layer.expanded.od-editable_buyer_layer.od-collapsible > div > div > div > div:nth-child(3) > div:nth-child(2) > div > input");
	By edream_bill_zip = By.cssSelector("#buyer > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.editable_buyer_layer.expanded.od-editable_buyer_layer.od-collapsible > div > div > div > div:nth-child(4) > div:nth-child(3) > div > input");
	By edream_bill_country_code = By.cssSelector("#buyer > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.editable_buyer_layer.expanded.od-editable_buyer_layer.od-collapsible > div > div > div > div.odf-form-row.od-rtl-input-cursor > div.odf-form-field.validation_field.valid > div > select");
	By edream_bill_phone = By.cssSelector("#buyer > div.odf-box.odf-box-primary.od-box-details-page > div.odf-box-content.od-box-content > div > form > div.editable_buyer_layer.expanded.od-editable_buyer_layer.od-collapsible > div > div > div > div.odf-form-row.od-rtl-input-cursor > div:nth-child(2) > div > input");
	By edream_bill_continue = By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div._32oTjHgM > div > div._2yzvbm49._1_zdslWs > div > div._10vOvFQn > div.D5l6fODi > div > div > div > div._1DOlEBU9 > div > div > div > div:nth-child(2) > div._1btvDUxb > div > div._2AksirfX.ui_column.is-7-tablet.is-7-mobile > div > button");
	
	public Pages(WebDriver driver){
		//System.out.println(driver);
		this.driver = driver;
		//System.out.println(driver);
		//System.out.println(this.driver);
	}
	
	public WebElement menu_more() {
		return driver.findElement(menu_more);
	}
	
	public WebElement more_flight() {
		return driver.findElement(more_flight);
	}
	
	public WebElement flight_page_from() {
		return driver.findElement(flight_page_from);
	}
	
	public WebElement flight_page_to() {
		return driver.findElement(flight_page_to);
	}
	
	public WebElement flight_page_external() {
		return driver.findElement(flight_page_external);
	}
	
	public WebElement flight_page_submit() {
		return driver.findElement(flight_page_submit);
	}
	
	public WebElement flight_deal_page_deal() {
		return driver.findElement(flight_deal_page_deal);
	}
	
	public WebElement flight_deal_page_external() {
		return driver.findElement(flight_deal_page_external);
	}
	
	public WebElement edream_agree() {
		return driver.findElement(edream_agree);
	}
	
	public WebElement edream_pass_1_first_name() {
		return driver.findElement(edream_pass_1_first_name);
	}
	
	public WebElement edream_pass_1_last_name() {
		return driver.findElement(edream_pass_1_last_name);
	}
	
	public WebElement edream_pass_1_plane_1_seat() {
		return driver.findElement(edream_pass_1_plane_1_seat);
	}
	
	public WebElement edream_pass_1_plane_2_seat() {
		return driver.findElement(edream_pass_1_plane_2_seat);
	}
	
	public WebElement edream_pass_1_plane_3_seat() {
		return driver.findElement(edream_pass_1_plane_3_seat);
	}
	
	public WebElement edream_pass_1_plane_4_seat() {
		return driver.findElement(edream_pass_1_plane_4_seat);
	}
	
	public WebElement edream_bill_mail() {
		return driver.findElement(edream_bill_mail);
	}
	
	public WebElement edream_bill_confirm_mail() {
		return driver.findElement(edream_bill_confirm_mail);
	}
	
	public WebElement edream_bill_address() {
		return driver.findElement(edream_bill_address);
	}
	
	public WebElement edream_bill_city() {
		return driver.findElement(edream_bill_city);
	}
	
	public WebElement edream_bill_country() {
		return driver.findElement(edream_bill_country);
	}
	
	public WebElement edream_bill_zip() {
		return driver.findElement(edream_bill_zip);
	}
	
	public WebElement edream_bill_country_code() {
		return driver.findElement(edream_bill_country_code);
	}
	
	public WebElement edream_bill_phone() {
		return driver.findElement(edream_bill_phone);
	}
	
	public WebElement edream_bill_continue() {
		return driver.findElement(edream_bill_continue);
	}
}
