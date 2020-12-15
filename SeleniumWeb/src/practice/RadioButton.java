package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	@SuppressWarnings("unused")
	public static <draganddrop> void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		bo.findElement(By.xpath("//input[@id='magazines-radio-btn']")).click();
		bo.findElement(By.xpath("//input[@id='bike-checkbox']")).click();
		bo.findElement(By.xpath("//input[@id='bicycle-checkbox']")).click();
		bo.findElement(By.xpath("//input[@id='suv-checkbox']")).click();
		bo.findElement(By.xpath("//input[@id='bike-checkbox']")).click();
		String CharSequence = "a";
		bo.findElement(By.xpath("//input[@id='enterText']")).sendKeys("a");
		
	}

}
