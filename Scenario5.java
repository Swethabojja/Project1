package Orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario5 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
		
		
	public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("password"));
	}
	
			
	public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[@type='submit'])"));

}
	public static WebElement recruitbutt(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
}
	public static WebElement add(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
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
	public static WebElement vaccany(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='lastName']"));

}
}
