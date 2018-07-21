package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Username {
@Test
	
	public void testingGuru99(){

	System.setProperty("webdriver.gecko.driver","C://Users//elcot//Desktop//selenium//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();

	driver.get("http://www.demo.guru99.com/V4/");


	WebElement Username=driver.findElement(By.name("uid"));
	Username.sendKeys("mngr142994");





	WebElement Password=driver.findElement(By.name("password"));
	Password.sendKeys("zUmUbah");

	WebElement Loginbutton=driver.findElement(By.name("btnLogin"));
	Loginbutton.click();
WebElement title=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/a"));


if(title.isDisplayed()){
	System.out.println("title is displayed");
	
}
else
	System.out.println("title is not displayed");






	driver.switchTo().alert().getText();
	
	
	
		
		
		
		
	}
	
	
}
