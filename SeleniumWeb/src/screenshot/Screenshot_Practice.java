package screenshot;

//import java.io.IOException;
import java.io.File;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Specify the path to your chrome driver
		 System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		// Instantiate chrome driver object
			WebDriver bo=new ChromeDriver();
			
		// Navigate to redbus website
		bo.get("https://www.redbus.in/");
		
		bo.manage().window().maximize();
		
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)bo;
		
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		//Path to the location to save screenshot
		//FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
		FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		System.out.println("Screenshot is captured");
		bo.quit();
		}
		}
		
	