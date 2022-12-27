package Orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class POM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Scenario1.username(driver).sendKeys("Admin");
		//Scenario1.password(driver).sendKeys("admin123");
		//Scenario1.login(driver).click();
		//Scenario1.logoutdropdown(driver).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Scenario1.logout(driver).click();
		//Scenario2.username(driver).sendKeys("Admin");
		//Scenario2.password(driver).sendKeys("admin123");
		//Scenario2.login(driver).click();
		//Scenario2.PIM(driver).click();
		//Scenario2.PIMadd(driver).click();
		//Scenario2.firstname(driver).sendKeys("Swetha");
		//Scenario2.middlename(driver).sendKeys("Rao");
		//Scenario2.lastname(driver).sendKeys("Bojja");
		//Scenario2.nickname(driver).sendKeys("Sweety");
		//Scenario2.empid(driver).sendKeys("21297");
		//Scenario2.logincredentials(driver).click();
		//Scenario2.username1(driver).sendKeys("swetha@12");
		//Scenario2.password1(driver).sendKeys("Swetha@12");
		//Scenario2.confirmpw(driver).sendKeys("Swetha@12");
		//Scenario2.save(driver).click();
		//Scenario2.logoutdropdown(driver).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Scenario2.logout(driver).click();
		//Scenario3.username(driver).sendKeys("Admin");
		//Scenario3.password(driver).sendKeys("admin123");
		//Scenario3.login(driver).click();
		//Scenario3.firstname(driver).sendKeys("Swetha");
		//Scenario3.middlename(driver).sendKeys("Rao");
		//Scenario3.lastname(driver).sendKeys("Bojja");
		//Scenario3.nickname(driver).sendKeys("Sweety");
		//Scenario3.otherid(driver).sendKeys("Sweety");
		//Scenario4.username(driver).sendKeys("Admin");
		//Scenario4.password(driver).sendKeys("admin123");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Scenario4.forgotpasswd(driver).click();
		//Scenario4.uname2(driver).sendKeys("Admin");
		//Scenario4.submitbutt(driver).click();
		//Scenario4.resetsuccess(driver).isDisplayed();
		//Scenario5.username(driver).sendKeys("Admin");
		//Scenario5.password(driver).sendKeys("admin123");
		//Scenario5.login(driver).click();
		//Scenario5.recruitbutt(driver).click();
		//Scenario5.add(driver).click();
		//Scenario5.firstname(driver).sendKeys("Swetha");
		//Scenario5.middlename(driver).sendKeys("Rao");
		//Scenario5.lastname(driver).sendKeys("Bojja");
		Scenario6.username(driver).sendKeys("Admin");
		Scenario6.password(driver).sendKeys("admin123");
		Scenario6.login(driver).click();
		Scenario6.recruitmenu(driver).click();
		Scenario6.vacanciesmenu(driver).click();
		Scenario6.addvacancybutt(driver).click();
		Scenario6.name(driver).sendKeys("Swetha");
		Scenario6.description(driver).sendKeys("Good Morning");
		Scenario6.hiringmanager(driver).sendKeys("Srinu");
		Scenario6.position(driver).sendKeys("10");
		Scenario6.submitbutt(driver).click();
	}

	
}

