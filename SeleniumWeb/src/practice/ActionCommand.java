package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		Actions act=new Actions(bo);
		act.moveToElement(bo.findElement(By.xpath("//body/div[@id='top-menu']/ul[@id='nav']/li[@id='admin']/a[1]/span[1]"))).perform();
		act.moveToElement(bo.findElement(By.xpath("//body/div[@id='top-menu']/ul[@id='nav']/li[@id='admin']/ul[1]/li[2]/a[1]/span[1]"))).perform();
		act.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Employment Status')]"))).perform();
		bo.findElement(By.xpath("//span[contains(text(),'Employment Status')]")).click();
		

	}

}
