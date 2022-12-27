package Orangehrm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
		
		
	public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("password"));
	}
	
			
	public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[@type='submit'])"));

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
	public static WebElement otherid(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
}
	public static WebElement empid(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));

	}
	public static WebElement licenceexpdate(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
}
	public static WebElement nationalitydropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]"));
}
	public static void nationalitylistselect(WebDriver driver) {
		List<WebElement> Nationality = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div[2]/div"));
		for (int i = 0; i<Nationality.size(); i++) {
			if (Nationality.get(i).equals("Indian")) {
				Nationality.get(i).click();
			}
	}
	}
	public static WebElement maritalstatus(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]"));	
	}
	public static void maritalselect(WebDriver driver) {
		List<WebElement> maritalStatus = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/div[2]/div"));
		for (int i = 0; i<maritalStatus.size(); i++) {
		if (maritalStatus.get(i).equals("Single")) {
			maritalStatus.get(i).click();
		}
		}
	}
		public static WebElement gender(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span"));

		}
		public static WebElement milservice(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input"));

		}
		public static WebElement save_3(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button"));

		}
		public static WebElement bloodtype(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[2]"));

		}
		public static void bloodtypelist(WebDriver driver) {
			List<WebElement> BloodType = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[2]/div[2]/div"));
			for (int i = 0; i<BloodType.size(); i++) {
				if (BloodType.get(i).equals("B+")) {
					BloodType.get(i).click();
				}
			}
		}
		public static WebElement save_4(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));

		}
		public static WebElement attachment(WebDriver driver) {
			return driver.findElement(By.xpath("/*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button"));

		}
		public static WebElement attachmentselect(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));

		}
		public static void attachmentlist(WebDriver driver) throws Throwable {
			Robot rb = new Robot();
			rb.delay(3000);
			StringSelection ss = new StringSelection("C:\\Users\\sweth\\swetha-workspace\\OrangeHRM\\Soursce\\RESUME.docx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		public static WebElement comment(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[2]/div/div/div/div[2]/textarea"));

		}
		public static WebElement save_5(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[3]/button[2]"));
		}
		//contact details
		public static void contactdetails(WebDriver driver) {
			WebElement ContactDetails = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a"));
			Actions act = new Actions(driver);
			act.scrollToElement(ContactDetails).click().build().perform();
		}
		public static WebElement street_1(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));

		}
		public static WebElement street_2(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"));

		}
		public static WebElement city(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input"));

		}
		public static WebElement state(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input"));

		}
		public static WebElement zipcode(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input"));

		}
		public static WebElement countrydropdown(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]"));

		}
		public static void countrylist(WebDriver driver) {
		List<WebElement> Country = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/div[2]/div"));
		for (int i = 0; i<Country.size(); i++) {
			if (Country.get(i).equals("India")) {
				Country.get(i).click();
			}
		}
		}
		public static WebElement home(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input"));

		}
		public static WebElement mobile(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"));
			}
			public static WebElement work(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input"));
			}
			public static WebElement work_email(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input"));
			}
			public static WebElement other_email(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input"));
			}
			public static WebElement save_6(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));
			}
			public static WebElement attachment_2(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button"));
			}
			public static WebElement add_file(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));
			}
			public static void  addfile_1(WebDriver driver) throws Throwable{
			Robot rb1 = new Robot();
			rb1.delay(3000);
			StringSelection resume2 = new StringSelection("C:\\Users\\sweth\\swetha-workspace\\OrangeHRM\\Soursce\\RESUME.docx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resume2, null);
			rb1.keyPress(KeyEvent.VK_CONTROL);
			rb1.keyPress(KeyEvent.VK_V);
			rb1.keyRelease(KeyEvent.VK_CONTROL);
			rb1.keyRelease(KeyEvent.VK_V);
			rb1.keyPress(KeyEvent.VK_ENTER);
			rb1.keyRelease(KeyEvent.VK_ENTER);
			}
			public static WebElement comment_3(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/div/div/div/div[2]/textarea"));
			}
			public static WebElement save_7(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[3]/button[2]"));
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
	