package login;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementPractice {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		// Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		// Create object of ChromeOption class
		ChromeOptions options= new ChromeOptions();
		
		// Set the experimental option
		options.setExperimentalOption("prefs", prefs);
		
		 // pass the options object in Chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver(options);
		bo.get("https://www.redbus.in/");


		//Thread.sleep(3000);
		//bo.findElement(By.xpath("//header/div[1]/div[1]/nav[1]/a[2]")).click();
		//bo.findElement(By.xpath("//body/div[@id='reactContentMount']/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
		bo.close();

	}

}
