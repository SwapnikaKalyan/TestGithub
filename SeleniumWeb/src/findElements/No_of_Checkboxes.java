package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		List<WebElement> numofcheckboxes=bo.findElements(By.xpath("//input[@type='checkboxes']"));
		System.out.println(numofcheckboxes.size());
	}

}
