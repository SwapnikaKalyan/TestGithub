package redbus;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BusTickets {

	public static void main(String[] args) {
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
				bo.manage().window().maximize();
				bo.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				bo.findElement(By.id("redBus")).click();
				//Thread.sleep(5000);
				bo.findElement(By.id("txtSource")).sendKeys("Bangalore");
				Select drpbox=new Select(bo.findElement(By.tagName("li")));
				drpbox.selectByIndex(2);;
				//bo.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]")).click();
				//bo.findElement(By.xpath("body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/label[1]")).click();
				//bo.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]")).click();
				//bo.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
				//bo.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("Tirupathi");

	}

}
