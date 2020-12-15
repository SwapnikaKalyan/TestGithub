package tradeMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MyTradeMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver bo=new ChromeDriver();
			bo.get("https://www.trademe.co.nz/");
			bo.findElement(By.xpath("//a[@id='SiteHeader_SiteTabs_myTradeMeDropDownLink']")).click();
			Actions act=new Actions(bo);
			act.moveToElement(bo.findElement(By.xpath("//a[@id='SiteHeader_SiteTabs_mtmViewMtmLink']"))).perform();
			bo.findElement(By.xpath("//a[@id='SiteHeader_SiteTabs_mtmViewMtmLink']")).click();
	}

}


