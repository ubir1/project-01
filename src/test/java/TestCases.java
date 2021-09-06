import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class TestCases {
	
	@Test
	void flightCheckout() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\eclipse_Workplace\\\\project-artifact-id\\\\libs\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tripadvisor.com/");
		driver.findElement(By.className("_2HtGEjYV _22upaSQN")).click();
		driver.findElement(By.className("_2U59ljCM")).click();
		
	}
}
