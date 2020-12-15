package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scrshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
            String bpath="https://www.redbus.in/";
		
            System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver bo=new ChromeDriver();
			bo.get(bpath);
			
	
		
			File SrcFile=((TakesScreenshot)bo).getScreenshotAs(OutputType.FILE);
			
		    //FileUtils.copyFile(SrcFile, new File("D:\\sss\\Test1ksadar.png"));
		    FileUtils.copyFile(SrcFile, new File("E:\\\\Swapnika\\\\Screenshot/Screen.png"));
	

	}

}
