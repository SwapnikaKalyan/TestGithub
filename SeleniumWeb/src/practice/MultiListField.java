package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Select obj=new Select(bo.findElement(By.xpath("//select[@id='selenium_suite']")));
		obj.selectByValue("IDE");
		Select obj2=new Select(bo.findElement(By.xpath("//select[@id='selenium_suite']")));
		obj2.selectByIndex(1);
		Select obj3=new Select(bo.findElement(By.xpath("//select[@id='selenium_suite']")));
		obj3.selectByVisibleText("Selenium RC");
		obj3.deselectByVisibleText("Selenium RC");
		
		
	}

}
