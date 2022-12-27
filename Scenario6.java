package Orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario6 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
		
		
	public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("password"));
	}
	
			
	public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[@type='submit'])"));

}
	public static WebElement recruitmenu(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));

}
	public static WebElement vacanciesmenu(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Vacancies']"));

}
	public static WebElement addvacancybutt(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));

}
	public static WebElement name(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input"));
}
	public static WebElement description(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div[2]/textarea"));

}
	public static WebElement hiringmanager(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));

}
	public static WebElement position(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input"));

}
	public static WebElement submitbutt(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));

}
}
