package assignments1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

		ChromeDriver driver;
		
		String qatechhubUrl = "http://qatechhub.com";
		String facebookUrl = "https://www.facebook.com";
	 
		public void invokeBrowser() {
	 
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
	 
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 
			driver.get(qatechhubUrl);
	 
			String titleOfThePage = driver.getTitle();
	 
			if (titleOfThePage.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {
				System.out.println("Test case PASS");
			} else {
				System.out.println("Test case FAIL");
			}
	 
		}
	 
		public void navigateCommands() {
			driver.navigate().to(facebookUrl);
	 
			String currentUrl = driver.getCurrentUrl();
	 
			System.out.println("Current URL :: " + currentUrl);
			driver.navigate().back();
	 
			driver.navigate().refresh();
	 
			driver.navigate().refresh();
		}
	 
		public static void main(String[] args) {
			Assignment1 assignment = new Assignment1();
	 
			assignment.invokeBrowser();
	}

}
