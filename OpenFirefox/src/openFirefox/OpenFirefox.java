package openFirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C://Users//elcot//Desktop//selenium//geckodriver.exe");
    	WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gsfi")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
