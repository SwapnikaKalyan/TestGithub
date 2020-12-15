package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver bo=new ChromeDriver();

String WebSite="https://www.redbus.in/";
bo.get(WebSite);
String Name;
Name=bo.getTitle();

System.out.println(Name);

bo.close();

//bo.quit();

WebDriver bo1=new ChromeDriver();
WebSite="https://www.stuff.co.nz/";
bo1.get(WebSite);

Name=bo1.getTitle();

System.out.println(Name);

bo1.close();


	}
	
}
