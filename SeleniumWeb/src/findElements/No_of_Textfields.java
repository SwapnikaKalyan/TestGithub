package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_Textfields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.redbus.in/");
		List<WebElement> numoftextfields=bo.findElements(By.tagName("input"));
		System.out.println(numoftextfields.size());
		for(int i=0; i<=numoftextfields.size();i++ ) 
		{
	
	System.out.println(numoftextfields.get(i).getAttribute("data-message"));
	//System.out.println(numoftextfields.get(i).getAttribute("id"));
	}
	}

}
