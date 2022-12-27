package Orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario4 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
}

	public static WebElement forgotpasswd(WebDriver driver) {
		return driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
}
	public static WebElement uname2(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='username']"));
}
	public static WebElement submitbutt(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));
}
	public static WebElement resetsuccess(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
}
	 public static void quit(WebDriver driver) {
     	driver.quit();
     }	
}
