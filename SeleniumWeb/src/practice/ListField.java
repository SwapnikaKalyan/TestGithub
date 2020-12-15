package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver bo=new ChromeDriver();
bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
//bo.findElement(By.xpath("//select[@id='programming-languages']")).click();
Select obj=new Select(bo.findElement(By.xpath("//select[@id='programming-languages']")));
//obj.selectByIndex(3);
obj.selectByValue("JavaScript");
//obj.selectByVisibleText("JavaScript");
}

}
