package Orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario2 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
		
		
	public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("password"));
	}
	
			
	public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[@type='submit'])"));

}
	public static WebElement PIM(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
	}
	public static WebElement PIMadd(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
	}
	

	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='firstName']"));

	}
	public static WebElement middlename(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='middleName']"));

	}
	public static WebElement lastname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='lastName']"));

	}
	public static WebElement nickname(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"));

	}
	public static WebElement empid(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));

	}
	public static WebElement logincredentials(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));

	}
	public static WebElement username1(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));
	}
	public static WebElement password1(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));

	}
	public static WebElement confirmpw(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));

	}
	public static WebElement save(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));

	}
	public static WebElement logoutdropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		
}
	public static WebElement logout(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Logout']"));
}
        public static void quit(WebDriver driver) {
        	driver.quit();
        }
}