package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_Links_and_names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
				WebDriver bo=new ChromeDriver();
				bo.get("https://www.redbus.in/");
				List<WebElement> numoflinks=bo.findElements(By.tagName("a"));
				System.out.println(numoflinks.size());
				for(int i=0; i<=numoflinks.size();i++ ) 
				{			
			      System.out.println(numoflinks.get(i).getText());
			}
			}


	}

