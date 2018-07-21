package openFirefox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invalidpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		System.setProperty("webdriver.gecko.driver","C://Users//elcot//Desktop//selenium//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("http://www.demo.guru99.com/V4/");


		WebElement Username=driver.findElement(By.name("uid"));
		Username.sendKeys("mngr142994");





		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("kenny");

		WebElement Loginbutton=driver.findElement(By.name("btnLogin"));
		Loginbutton.click();

		
	
		
	Alert alert=driver.switchTo().alert();
	String output=alert.getText();
	alert.accept();
	System.out.println(output);
		
		
		
		
		
		
		
	}

}
