package openFirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invalidusernamepassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

		System.setProperty("webdriver.gecko.driver","C://Users//elcot//Desktop//selenium//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("http://www.demo.guru99.com/V4/");


		WebElement Username=driver.findElement(By.name("uid"));
		Username.sendKeys("kenny");





		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("12345");

		WebElement Loginbutton=driver.findElement(By.name("btnLogin"));
		Loginbutton.click();
    
		
		
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[1]/a")).click();
		
		driver.switchTo().alert().getText();
		
		
		
		
		
		
		
		
	}

}
